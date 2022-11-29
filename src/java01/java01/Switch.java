package java01.java01;

public class Switch {
    public static void main(String[] args) {
        int n = 3;
        
        switch (n) {
            case 1:
                System.out.println("Simple JAva");
            case 2:
                System.out.println("Funny Java");
            case 3:
                System.out.println("Fantastic Java");
                // 3번만 출력하고 싶으면  break; 입력 (걸리면 break까지..)
            default:
                System.out.println("The best programming language");
        }
        
        System.out.println("Do you like Java?");
        // Fantastic Java
        // The best programming language
        // Do you like Java?
    }
}
