package java01.java01;

public class ValueOf {
    public static void main(String[] args) {
        int i = 10;
        double d = 3.14;
        
        String st1 = String.valueOf(i);
        st1 = String.valueOf(true);
        
        String st2 = String.valueOf(d);
        
        System.out.println(st1);
        System.out.println(st1 + st2);
        
        // true
        // true3.14
        
        System.out.println(1);
        System.out.println('1');
        System.out.println("1");
        // 콘솔에 찍히는건 문자열이다.
        // 숫자든 문자든 문자열로 변환해서 출력
        // String.valueOf()
    }
}
