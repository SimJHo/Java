package java01.java01;

public class Constants {
    public static void main(String[] args) {
        //변수 선언하고 값을 처음 넣는 것을 초기화라고 한다.
        final int MAX_SIZE = 100; //대문자로 적고 두 단어를 같이 쓸 경우 _로 연결
        final char CONST_CHAR = '상';
        final int CONST_ASSIGNED;
        
        CONST_ASSIGNED = 12;
        
        System.out.println("상수1 : "+MAX_SIZE);
        System.out.println("상수2 : "+CONST_CHAR);
        System.out.println("상수3 : "+CONST_ASSIGNED);
        
        //반지름이 10인 원이 넓이를 구하는 프로그램
        double r;
        final double PI = Math.PI;
        
        r = 10;
        
        System.out.println(PI*r*r);      
    }
}
