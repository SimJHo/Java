package java01.java01;

public class Method {
    public static void main(String[] args) {
        System.out.println("프로그램의 시작");
        hiEveryone(12); // 12를 전달하며 hiEveryone 호출
        hiEveryone(13); // 13를 전달하며 hiEveryone 호출
        System.out.println("프로그램의 끝");
    }
    // 매개변수가 하나인 메소드 정의
    public static void hiEveryone(int age) {
        System.out.println("좋은 아침입니다.");
        System.out.println("제 나이는 "+ age + "세 입니다.");
    }
    // public static 리턴타입 함수이름(파라미터){로직}
    // 리턴타입에는 자료형9개 + void 총 10개가 들어갈 수 있다.
    // 함수명은 앞에 소문자로 시작, 파라미터(인자)에는 변수선언이 들어간다.
}
