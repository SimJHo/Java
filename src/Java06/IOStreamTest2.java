package Java06;
//1K바이트 버퍼 기반 파일 복사 프로그램

import java.io.*;
import java.util.Scanner;

public class IOStreamTest2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("대상 파일 : ");
        String src = sc.nextLine();

        System.out.print("사본 이름 : ");
        String dst = sc.nextLine();
        // 절대경로를 넣어도 됨.
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dst))){
            byte buf[] = new byte[1024]; //0으로 초기화 되어있음
            // 킬로바이트 1024바이트 = 2의 10승 바이트
            int len;

            while (true){
                len = in.read(buf);
                // 배열 buf로 데이터를 읽어 들이고 더 이상 읽어 들일 데이터 없으면 -1 반환
                if (len == -1){
                    break;
                }
                out.write(buf, 0, len);
                //len 바이트만큼 데이터를 저장한다.
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("파일 복사 완료");
    }
}
