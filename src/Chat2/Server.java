package Chat2;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){

        try {
            ServerSocket serverSocket = new ServerSocket(3000);
            Socket socket = serverSocket.accept();

            Sender sender = new Sender(socket);
            Receiver receiver = new Receiver(socket);

            sender.start();
            receiver.start();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

