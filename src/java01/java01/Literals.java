package java01.java01;

public class Literals {
    public static void main(String[] args) {
        //메모리에 올릴때 방이름(변수명)이 없기때문에 바꿀수 없다. = 상수
        //정수는 int, 실수는 double
        //뒤에 L을 붙여줘야 long으로 인식한다.
        long num = 3000000000L;
        System.out.println(num + 3000000000L);
        
        //실수는 기본 double형임을 명시하기 위해 d또는 D삽입 가능
        System.out.println(3.00000123D + 3.00000123D);
        
        //실수형 상수 e표기법
        System.out.println(3.4e3); //3.4 * 10^3 = 3400.0
        System.out.println(3.4e-3); //3.4 * 10^-3 = 0.0034
        
        //이스케이프 시퀀스
        System.out.println("AB" + '\t' + 'c');
        System.out.println("AB" + '\n' + 'c');
    }
}
