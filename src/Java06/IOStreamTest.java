package Java06;

import java.io.*;

public class IOStreamTest {
    public static void main(String[] args){
        try(OutputStream out = new FileOutputStream("data.dat")) {
            out.write(7);
        } // try-with-resource : close() 안해도 됨.
        catch(IOException e) {
            e.printStackTrace();
        }

        ReadFromFile read = new ReadFromFile();
        read.read();
    }
}

class ReadFromFile{
    public void read(){
        try(InputStream in = new FileInputStream("data.dat")) {
            int dat = in.read();
            System.out.println(dat);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}