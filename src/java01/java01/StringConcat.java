package java01.java01;

public class StringConcat {
    public static void main(String[] args) {
        String st1 = "Coffee"; // immutable
        String st2 = "Bread";  // 원본 불변 (final)
        
        String st3 = st1.concat(st2);
        System.out.println(st3);
        // st1과 같은 주소에서 붙이는게 아니고 st3주소를 따로 만들고 붙인다.
        System.out.println(st1);
        
        String st4 = "Fresh".concat(st3);
        System.out.println(st4);
        // CoffeeBread
        // Coffee
        // FreshCoffeeBread
        
        System.out.println("funny" + "camp"); // funnycamp
        
        String str = "funny";
        
        str += "camp";
        
        System.out.println(str); // funnycamp            
    }
}
