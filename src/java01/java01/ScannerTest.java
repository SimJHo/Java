package java01.java01;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        String source = "1 2 3";
        Scanner sc = new Scanner(source); // Scanner 인스턴스 생성
        int num1 = sc.nextInt(); // int형 데이터 추출
        int num2 = sc.nextInt(); // int형 데이터 추출
        int num3 = sc.nextInt(); // int형 데이터 추출

        int sum = num1 + num2 + num3;
        System.out.printf("%d + %d + %d = %d \n", num1, num2, num3, sum);
        // 1 + 2 + 3 = 6 
        
        Scanner sc2 = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String str1 = sc2.nextLine();

        System.out.print("문자열 입력: ");
        String str2 = sc2.nextLine();

        System.out.printf("입력된 문자열 1: %s \n", str1);
        System.out.printf("입력된 문자열 2: %s \n", str2);
    }
}
