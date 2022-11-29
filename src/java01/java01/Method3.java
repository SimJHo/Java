package java01.java01;

public class Method3 {
    public static void main(String[] args) {
        starPrint(3);
        starPrint(7);
        
        System.out.println(grade(avg(100, 95, 95)));
        
        System.out.println(getHap(10));
    }
    public static void starPrint(int num) {
        for(int i = 1; i <= num; i++) {            
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static Double avg(double num1, double num2, double num3) {
        double total = num1 + num2 + num3;
        double avg = total / 3.0;
        return avg;
    }
    public static String grade(double num) {
        if(num >= 90) {
            return "수입니다";
        }
        else if(num >= 80) {
            return "우입니다";
        }
        else if(num >= 70) {
            return "미입니다";
        }
        else if(num >= 60) {
            return "양입니다";
        }
        else {
            return "가입니다";
        }
    }
    public static int getHap(int num) {
        int sum = 0;
        
        for(int i = 1; i <= num; i++) {
            if(i < num) {
            System.out.print(i + "+");
            sum = sum + i;
            }
            else {
            System.out.print(i + "=");
            sum = sum + i;
            }
        }
        return sum;
    }
}
