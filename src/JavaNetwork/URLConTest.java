package JavaNetwork;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class URLConTest {
    public URLConTest(){
        String code = null;
        System.out.println("웹 주소를 입력 하세요");
        Scanner sc = new Scanner(System.in);
        String address = sc.next();

        try {
            URL url = new URL(address);
            URLConnection con = url.openConnection();
            BufferedReader webData = new BufferedReader(new InputStreamReader(con.getInputStream()));
            FileWriter fw = new FileWriter("C:\\Sim\\Java\\file.html", false);

            while ((code = webData.readLine()) != null){
                fw.write(code);
                System.out.println(code); //html을 가져온다.
            }
            System.out.println("The end");

            fw.close();
            webData.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        new URLConTest();
    }
}
