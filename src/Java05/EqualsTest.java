package Java05;
//2. 아래를 참고하여, 메소드 equals()와 연산자 == 의 차이를 비교 설명하시오.(필수) ⭐️

public class EqualsTest {
    public static void main(String[] args) {
        String s1 = new String("java");
        String s2 = new String("java");
        String s3 = s2;

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2 == s3);
        System.out.println(s2.equals(s3));

        if(s1 == s2)
            System.out.println("s1, s2 참조 대상 같다.");
        else
            System.out.println("s1, s2 참조 대상 다르다. ");

        if(s2 == s3)
            System.out.println("s2, s3 참조 대상 같다.");
        else
            System.out.println("s2, s3 참조 대상 다르다. ");

        if(s1.equals(s2))
            System.out.println("s1, s2 내용 동일하다.");
        else
            System.out.println("s1, s2 내용 다르다.");

        if(s2.equals(s3))
            System.out.println("s2, s3 내용 동일하다.");
        else
            System.out.println("s2, s3 내용 다르다.");
    }

    //false
    //true
    //true
    //true
    //s1, s2 참조 대상 다르다.
    //s2, s3 참조 대상 같다.
    //s1, s2 내용 동일하다.
    //s2, s3 내용 동일하다.

    // ==은 주소값을 비교하는 연산자이고
    // equals는 내용을 비교하는 연산자이다.
}
