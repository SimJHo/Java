package Chat2;

import java.net.Socket;

public class Client {
    public static void main(String[] args){
        String serverIP = "127.0.0.1";
        Socket socket = null;

        try {
            socket = new Socket(serverIP, 3000);

            System.out.println("서버에 연결되었습니다.");

            Sender sender = new Sender(socket);
            Receiver receiver = new Receiver(socket);

            sender.start();
            receiver.start();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
