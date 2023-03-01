package Java04;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ThrowsTest {
    public static void main(String[] args){
        try {
            md1();
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("예외");
        }
    }

    public static void md1() throws IOException{ // IOException 예외 넘긴다고 명시!
        md2();
    }

    public static void md2() throws IOException { // IOException 예외 넘긴다고 명시!
        Path file = Paths.get("C:\\javastudy\\Simple.txt");
        BufferedWriter writer = null;
        writer = Files.newBufferedWriter(file);   // IOException 발생 가능
        writer.write('A');   // IOException 발생 가능
        writer.write('Z');   // IOException 발생 가능

        // 함수에서 Checked Exception을 던지면 무조건 받아서 예외처리를 해줘야 한다.
        // newBufferedWriter(), write() 함수에서 IOException을 던지고 있음.
        // 그러므로 md2()에서 throws IOException을 안해주면 에러 발생.

        if(writer != null)
            writer.close();   // IOException 발생 가능
    }
}
