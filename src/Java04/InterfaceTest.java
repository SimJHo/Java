//package Java04;
//
//import java.util.Scanner;
//
////    interface 상수의 경우
////    public static final int COUNT = 3;
////    public static final은 생략 가능
////    static이므로 접근 할때 ICalculator.COUNT
//
//interface ICalculator{
//    int add(int num1, int num2);
//    int sub(int num1, int num2);
//    int multi(int num1, int num2);
//    double div(int num1, int num2);
//}
//
//class Calculator implements ICalculator{
//    @Override
//    public int add(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    @Override
//    public int sub(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    @Override
//    public int multi(int num1, int num2) {
//        return num1 * num2;
//    }
//
//    @Override
//    public double div(int num1, int num2) {
//        return (double) num1 / num2;
//    }
//}
//public class InterfaceTest {
//    public static void main(String[] args){
//        CalculatorPrac calculator = new CalculatorPrac();
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("4칙연산 계산기입니다. 정수 2개를 입력해주세요");
//        System.out.println("첫번째 숫자: ");
//        int num1 = sc.nextInt();
//        System.out.println("두번째 숫자: ");
//        int num2 = sc.nextInt();
//
//        System.out.println("더하기 : " + calculator.add(num1,num2));
//        System.out.println("빼기 : " + calculator.sub(num1,num2));
//        System.out.println("곱하기 : " + calculator.multi(num1,num2));
//        System.out.println("나누기 : " + calculator.div(num1,num2));
//
//        // 추상 클래스 사용
//        AbstractCalculator abstractCalculator = new AbstractCalculator(5,3);
//        System.out.println(abstractCalculator.add()); // 8
//    }
//}
//
//// 추상 클래스 사용
//abstract class ACalculator{
//    protected int num1, num2;
//    // 자식 클래스에서 직접 사용 가능
//
//    public ACalculator(int num1, int num2){
//        this.num1 = num1;
//        this.num2 = num2;
//    }
//
//    public abstract int add();
//}
//
//class AbstractCalculator extends ACalculator{
//
//    public AbstractCalculator(int num1, int num2) {
//        super(num1, num2);
//    }
//
//    @Override
//    public int add() {
//        return num1 + num2;
//    }
//}