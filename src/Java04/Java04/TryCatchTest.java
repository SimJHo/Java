package Java04;

import java.util.Scanner;

public class TryCatchTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("a/b...a? ");
            int n1 = sc.nextInt();

            System.out.print("a/b...b? ");
            int n2 = sc.nextInt();

            System.out.printf("%d / %d = %d \n", n1, n2, n1/n2);
        }
        catch (ArithmeticException e){ // Exception과 순서를 바꾸면 에러
            e.printStackTrace();
            System.out.println("0으로 나눌 수 없습니다.");
        }
        catch (Exception e){ // polymorphism
            e.printStackTrace();
            System.out.println("잘못된 입력입니다.");
        }
        finally { // 무조건 실행
            System.out.println("Goodbye~!");
        }
    }
}
