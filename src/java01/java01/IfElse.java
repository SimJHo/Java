package java01.java01;

public class IfElse {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 7;
        
        if(n1 < n2) {
            System.out.println("n1 < n2 is true");
        }
        
        if(n1 == n2) {
            System.out.println("n1 == n2 is true");
        }
        else {
            System.out.println("n1 == n2 is false");
        }
        // n1 < n2 is true
        // n1 == n2 is false
        
        int kor = 96;
        int eng = 86;
        int mat = 78;
        
        double avg = ((double)kor + eng + mat) / 3;
        
        if(avg >= 90) {
            System.out.println(avg +"점으로 수입니다.");
        }
        else if (avg >= 80) {
            System.out.println(avg +"점으로 우입니다.");
        }
        else if (avg >= 70) {
            System.out.println(avg +"점으로 미입니다.");
        }
        else if (avg >= 60) {
            System.out.println(avg +"점으로 양입니다.");
        }
        else {
            System.out.println(avg +"점으로 가입니다.");
        }
        // 86.66666666666667점으로 우입니다.
        
        //삼항연산자
        int num1 = 50;
        int num2 = 100;
        
        int big = (num1 > num2) ? num1 : num2;
        
        System.out.println("큰 수 : " + big); // 큰 수 : 100
        
        int diff = (num1 > num2) ? (num1 - num2) : (num2 - num1);
        // = Math.abs(num1 - num2)
        System.out.println("num1과 num2의 차이의 절대값 : " + diff);
        //num1과 num2의 차이의 절대값 : 50
    }
}
