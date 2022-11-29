package Java04;

// 기본적으로 함수 선언(추상 함수)과 상수만 올 수 있다.
// interface = 자손이 구현하라.
interface Printable{ // MS가 정의하고 제공한 인터페이스
    public final double PI = 3.14;
    public abstract void print(String doc);
    // public final, public abstract를 생략하면
    // 컴파일러가 자동으로 붙여준다.
}

// 제조사 : 삼성
class SprinterDriver implements Printable{

    @Override
    public void print(String doc) {
        System.out.println("From Samsung Printer");
        System.out.println(doc);
    }
}

// 제조사 : LG
class LprinterDriver implements Printable{

    @Override
    public void print(String doc) {
        System.out.println("From LG Printer");
        System.out.println(doc);
    }
}

public class InterfaceMain {
    public static void main(String[] args){
        String myDoc = "This is a report about...";

        // 삼성 프린터로 출력
        Printable prn = new SprinterDriver();
        prn.print(myDoc);
        System.out.println();
        // From Samsung Printer
        // This is a report about...

        //LG 프린터로 출력
        prn = new LprinterDriver();
        prn.print(myDoc);
        // From LG Printer
        // This is a report about...
    }
}
