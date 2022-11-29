package java01.java01;

public class ArithOp {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 3;
        
        System.out.println("num1 + num2 = " + num1 + num2); // 73 (문자열부터 계산되기 때문)
        System.out.println("num1 + num2 = " + (num1 + num2)); // 10
        
        short num = 10;
        num = (short)(num + 77L); //형 변환 안하면 컴파일 오류 발생
        int rate = 3;
        rate = (int)(rate * 3.5); //형 변환 안하면 컴파일 오류 발생
        
        System.out.println(num); // 87
        System.out.println(rate); // 10
        
        num = 10;
        num += 77L; //형 변환 필요하지 않음
        rate = 3;
        rate *= 3.5; //형 변환 필요하지 않음
        
        System.out.println(num); // 87
        System.out.println(rate); // 10
        
        System.out.println("7.0 == 7 : " + (7.0 == 7)); // true
        System.out.println("7.0 != 7 : " + (7.0 != 7)); // false
        
        int num3 = 11;
        int num4 = 22;
        boolean result;
        
        result = (1 < num3) && (num3 < 100);
        System.out.println("1 초과 100 미만인가? " + result); // true
        
        result = ((num4 % 2) == 0) || ((num4 % 3) == 0);
        System.out.println("2 또는 3의 배수인가? " + result); // true
        
        result = !(num3 != 0);
        System.out.println("0 인가? " + result); //false
        
        int num5 = 77;
        
        result = ((num5 % 7) == 0) && ((num5 % 11) == 0);
        System.out.println("7의 배수이고 11의 배수인가? " + result); // true
        
        result = ((num5 % 7) == 0) && ((num5 % 11) == 0) && ((num5 % 2) == 0);
        System.out.println("7의 배수이고 11의 배수이고 짝수인가? " + result); // false
    }
}
