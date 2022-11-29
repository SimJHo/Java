package java01.java01;

public class ForWhile {
    public static void main(String[] args) {
        // while문
        int num = 0;
        
        while(num < 5) {
            System.out.println("I like Java " + num);
            num++;
        }
        
        // do while문
        int num1 = 0;
        
        do {
            System.out.println("I like Java " + num1);
            num1++;
        }while(num1 < 5);
        
        // for문
        for(int num2 = 0; num2 < 5; num2++) {
            System.out.println("I like Java " + num2);
        }// 변수선언 ->( 조건 -> 실행 -> 증가 )->( 조건 -> 실행 -> 증가 )순으로 진행됨
         // 조건이 false면 탈출
        
        // 1부터 100까지의 합
        int sum = 0;
        
        for(int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        
        //구구단
        for(int i = 2; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
        }
    }
}
