package java01.java01;

public class UserVariable {
    public static void main(String[] args) {
        int num1;   //이름(int) -> 크기(4byte = 32bit) + 용도(실수, 정수, 주소 중에서 정수)
        num1 =10;        
        int num2 = 20;
        int num3 = num1 + num2;
        
        System.out.println(num1 + " + " + num2 + " = " + num3);
                
        double num4, num5;
        double result;
        num4 = 1.0000001;
        num5 = 2.0000001;
        result = num4 + num5; //실수 표현 방식에 의한 오차
        
        System.out.println(result);
        
        short num6 = 11;
        short num7 = 22;
        int result2 = num6 + num7; //short result2 로 하면 에러 , 연산할 때 int로 바꿔서 하기 때문. 
                                   //JVM은 32bit시스템이기 때문에 int 이하는 인트로 연산. (32bit를 채우기위해)
        System.out.println(result2);
    }
}
//  OS 32비트는 0~2의32승 까지의 주소를 사용(RAM 4gb + 4gb(가상) = 8gb). 64비트는 0~2의64승(RAM 8gb + 8gb(가상) = 16gb).