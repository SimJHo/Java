package java01.java01;

public class SCE {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        boolean result;
        
        result = ((num1 += 10) < 0) && ((num2 += 10) > 0); //앞에 false가 나오면 뒤는 연산 안함
        System.out.println("result = " + result);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2 + '\n');
        
        result = ((num1 += 10) > 0) || ((num2 += 10) > 0); //앞에 true가 나오면 뒤는 연산 안함
        System.out.println("result = " + result);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        
        int num = 5;
        
        System.out.println((num++) + " "); // 5
        System.out.println((num++) + " "); // 6
        System.out.println((num) + "\n");  // 7
        
        System.out.println((num--) + " "); // 7
        System.out.println((num--) + " "); // 6
        System.out.println(num);           // 5
    }
}
