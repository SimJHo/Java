package JavaNetwork;

import java.net.InetAddress;
import java.util.Scanner;

public class InetAddressTest {
    public InetAddressTest(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Host 이름을 입력하세요.");

        try {
            InetAddress inetAddress = InetAddress.getByName(sc.next());

            System.out.println("Computer Name : " + inetAddress.getHostName());
            System.out.println("Computer IP : " + inetAddress.getHostAddress());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args){
        new InetAddressTest();

        //Host 이름을 입력하세요.
        //www.naver.com
        //Computer Name : www.naver.com
        //Computer IP : 223.130.195.200
    }
}
