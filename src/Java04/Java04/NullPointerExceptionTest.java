package Java04;

public class NullPointerExceptionTest {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str);   // null 출력

        try {
            int len = str.length();   // Exception!
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("에러");
        }
    }
}
