package Chat;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer extends Thread{

    public static ArrayList<Socket> clients = new ArrayList<>(5);
    private Socket socket;

    public ChatServer(Socket socket){
        this.socket = socket;
    }

    public void remove(Socket socket){
        for (Socket s : ChatServer.clients) {
            if(socket == s){
                ChatServer.clients.remove(socket);
                break;
            }
        }
    }

    @Override
    public void run(){
        InputStream fromClient = null;
        OutputStream toClient = null;

        try {
            System.out.println(socket);

            fromClient = socket.getInputStream();

            byte[] buf = new byte[1024];
            int len;

            while((len = fromClient.read(buf)) != -1){
                for (Socket s : ChatServer.clients) {
                    if(socket != s){
                        toClient = s.getOutputStream();
                        toClient.write(buf, 0, len);
                        toClient.flush();

//                        System.out.println(fromClient.read(buf,0,len));
                    }
                }
                System.out.write(buf, 0, len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(socket != null){
                    socket.close();
                    remove(socket);
                }
                fromClient = null;
                toClient = null;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            System.out.println(serverSocket);

            while (true){
                Socket client = serverSocket.accept();
                clients.add(client);

                ChatServer myServer = new ChatServer(client);

                myServer.start();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
