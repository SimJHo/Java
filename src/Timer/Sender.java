package Timer;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender extends Thread{

    Socket socket;
    DataOutputStream out;
    String name;

    public Sender(Socket socket){
        try {
            out = new DataOutputStream(socket.getOutputStream());
            name = "["+ socket.getInetAddress() +":"+ socket.getPort()+"]";
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void run(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            try {
                out.writeUTF(name + scanner.nextLine());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
