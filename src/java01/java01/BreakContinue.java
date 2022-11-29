package java01.java01;

public class BreakContinue {
    public static void main(String[] args) {
        int num = 1;
        int count = 0;
        
        // 5의 배수이자 7의 배수인 수를 찾고 몇개인지 출력하는 반복문
        while((num++) < 100) {
            if(((num % 5) != 0) || ((num % 7) != 0)) {
                continue;}
            count++;
            System.out.println(num);
        }
        System.out.println("count : " + count);
        
        
        boolean search = false;
        int num1 = 1;
        // 처음 만나는 5의 배수이자 7의 배수인 수를 찾는 반복문
        while(num1 < 100) {
            if(((num1 % 5) == 0) && ((num1 % 7) == 0)) {
                search = true;
                break;
            }
            num1++;
        }
        if(search)
            System.out.println("찾는 정수 : " + num1);
        else
            System.out.println("찾지 못하였습니다.");
    }
}
