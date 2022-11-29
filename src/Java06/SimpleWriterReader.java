package Java06;

import java.io.*;
import java.util.Scanner;

public class SimpleWriterReader {
    public static void main(String[] args){
        try (Writer out = new FileWriter("data.txt")){
            out.write('A');
            out.write('한');

            for(int ch = (int)'A'; ch < (int)('Z'+1); ch++){
                out.write(ch);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("읽을 파일 : ");
        String src = sc.nextLine();

        try (Reader in = new FileReader(src)){
            int ch;

            while (true){
                ch = in.read();
                if (ch == -1){
                    break;
                }
                System.out.print((char) ch);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        //읽을 파일 : data.txt
        //A한ABCDEFGHIJKLMNOPQRSTUVWXYZ
    }
}
