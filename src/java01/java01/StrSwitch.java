package java01.java01;

public class StrSwitch {
    public static void main(String[] args) {
        String str = "two";
                
        switch(str) {
            case "one" :
                System.out.println("one");
                break;
            case "two" : // 상수풀 주소값 비교
                System.out.println("two");
                break;
            default:
                System.out.println("default");
        }
    }
}
