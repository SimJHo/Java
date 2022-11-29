package java01.java01;

public class Casting {
    public static void main(String[] args) {
        int num1 = 50;
        long num2 = 3147483647L;
        
        System.out.println(num1 + num2); //num1에 저장된 값이 long형으로 자동 형 변환 된다.
        //두 피연산자의 자료형이 일치해야 연산을 진행할 수 있다. 2진수로 연산하기 때문에 bit수를 맞춰야 한다.
        char ch = 'A';
        short sh = 100;
        
        int result = ch + sh; //int보다 작으면 int로 형변환
        
        System.out.println(result);
        
        float f1 = 0.1f; //0.1은 double로 인식하기 때문에 f를 붙여준다.
        long l = 10L;
        
        float result2 = f1 + l; //크기 상관없이 정수형보다 실수형이 우선 한다.
        
        System.out.println(result2);
        
        //명시적 형변환
        double pi = 3.1415;
        int num = (int)pi; //강제 형변환
        
        System.out.println(num); //int형이기 때문에 3만 출력된다.
        
        long num3 = 3000000007L;
        int num4 = (int)num3;
        
        System.out.println(num4); // -1294967289
        
        short sh1 = 10;
        short sh2 = 20;
        
        short sh3 = (short)(sh1 + sh2);
        
        System.out.println(sh3); // 30
        
        int a = 3;
        int b = 4;
        
        double c = a/b; //정수끼리 연산하기 때문에 자동 형변환 되서 CPU에서 소수부분을 버리고 0을 리턴
        //명시적 형변환을 해줘야 한다. a/(double)b;
        System.out.println(c); // 0.0 (리턴 후에 실수형으로 변환된다.)
        
        //국어 영어 수학 점수를 90,70,80점으로 넣고, 총점과 평균을 구하시오.
        int kor = 90;
        int eng = 70;
        int mat = 80;
        
        int total = kor + eng + mat;
        double avg = (double)total /3;
        
        System.out.println("총점 : " + total); //총점 : 240
        System.out.println("평균 : " + avg);   //평균 : 80.0
    }
}
