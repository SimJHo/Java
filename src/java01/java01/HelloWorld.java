package java01.java01;

/*
파일이름 : HelloWorld.java
작 성 자 : 심준호
작 성 일 : 2022월 10월 24일
목     적 : System.out.println() 메소드의 기능 테스트
*/
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        System.out.println("I am programer!!");
        System.out.println(7);
        System.out.println(3.15);
        System.out.println("3 + 5 = " + 8); // 숫자 8을 문자열로 바꿔서 결합.
        System.out.println(3.15 + "는 실수입니다.");
        System.out.println("3 + 5 " + "의 연산 결과는 8입니다.");
        System.out.println(3 + 5);
        System.out.println("3 + 5 = " + 3 + 5); // 앞에서 부터 연산하기 때문에 3이 문자열로 바뀌고 그 뒤에 5도 문자열로 바뀌기 때문에 35로 출력됨.
    }
}
