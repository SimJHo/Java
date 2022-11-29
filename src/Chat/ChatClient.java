package Chat;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ChatClient extends Thread{
    Socket socket = null;

    public ChatClient(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run(){
        InputStream fromServer = null;

        try {
            fromServer = socket.getInputStream();

            byte[] buf = new byte[1024];
            int len;

            while ((len = fromServer.read(buf)) != -1){
                System.out.write(buf, 0, len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(fromServer != null){
                    fromServer.close();
                }
                if(socket != null){
                    socket.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        Socket socket = null;

        try {
            socket = new Socket("localhost", 9999);
            System.out.println(socket);

            OutputStream toServer = socket.getOutputStream();

            ChatClient chatClient = new ChatClient(socket);

            chatClient.start();

            byte[] buf = new byte[1024];
            int len;
            int name = System.in.read();

            while ((len = System.in.read(buf)) != -1){
                toServer.write(name);
                toServer.write(buf, 0, len);
                toServer.flush();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(socket != null){
                    socket.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}