package Java04;

interface Printables{
    void print(String doc);
    default void printCMYK(String doc){
        System.out.println(doc);
    } // 디폴트 메소드 추가
}

// 제조사 : 삼성
class SprinterDrivers implements Printables{

    @Override
    public void print(String doc) {
        System.out.println("From Samsung Printer");
        System.out.println(doc);

        printCMYK("컬러 프린트"); // default 함수 호출
    }
}

// 제조사 : LG
class LprinterDrivers implements Printables{

    @Override
    public void print(String doc) {
        System.out.println("From LG Printer");
        System.out.println(doc);
    }

    // default 함수 오버라이딩
    @Override
    public void printCMYK(String doc){
        System.out.println("컬러 지원");
        System.out.println(doc);
    }
}
public class DefaultMethod {
    public static void main(String[] args){
        String myDoc = "This is a report about...";

        // 삼성 프린터로 출력
        Printables prn = new SprinterDrivers();
        prn.print(myDoc);
        System.out.println();

        //LG 프린터로 출력
        prn = new LprinterDrivers();
        prn.print(myDoc);
        prn.printCMYK(myDoc);

        // From Samsung Printer
        // This is a report about...
        // 컬러 프린트
        //
        // From LG Printer
        // This is a report about...
        // 컬러 지원
        // This is a report about...
    }
}
