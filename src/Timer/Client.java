package Timer;

import java.net.Socket;

public class Client{
    public static void main(String[] args){

        try {
            Socket socket = new Socket("localhost", 3000);

            Sender sender = new Sender(socket);
            Receiver receiver = new Receiver(socket);

            sender.start();
            receiver.start();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
