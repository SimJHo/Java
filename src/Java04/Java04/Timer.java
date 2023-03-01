package Java04;

interface Printable1{
    void print(Object doc);
}

class SPrinterDriver1 implements Printable1{

    @Override
    public void print(Object doc) {
        System.out.println(doc);
        System.out.println("삼성");
    }
}

class LPrinterDriver1 implements Printable1{

    @Override
    public void print(Object doc) {
        System.out.println(doc);
        System.out.println("LG");
    }
}

public class Timer {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";

        // 삼성 프린터로 출력
        Printable1 prn = new SPrinterDriver1();
        prn.print(myDoc);

        System.out.println();

        // LG 프린터로 출력
        prn = new LPrinterDriver1();
        prn.print(myDoc);
    }
}
