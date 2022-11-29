package java01.java01;

public class ImmutableString {
    public static void main(String[] args) {
        String str1 = "Simple String"; // literal
        String str2 = "Simple String"; // literal = 상수
        // 상수는 인스턴스에 올릴 때 같은 것이 있으면 인스턴스풀(상수풀)에 한번만 올림

        String str3 = new String("Simple String");
        String str4 = new String("Simple String");

        if (str1 == str2)  // 참조변수의 참조 값 비교
            System.out.println("str1과 str2는 동일 인스턴스 참조");
        else
            System.out.println("str1과 str2는 다른 인스턴스 참조");

        if (str3 == str4)  // 참조변수의 참조 값 비교
            System.out.println("str3과 str4는 동일 인스턴스 참조");
        else
            System.out.println("str3과 str4는 다른 인스턴스 참조");
        
        // str1과 str2는 동일 인스턴스 참조
        // str3과 str4는 다른 인스턴스 참조
    }
}
