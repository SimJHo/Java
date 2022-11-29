package java01.java01;

public class ArrayFor {
    public static void main(String[] args) {
        String[] sr = new String[7];
        
        sr[0] = new String("java");
        sr[1] = new String("system");
        sr[2] = new String("compiler");
        sr[3] = new String("park");
        sr[4] = new String("tree");
        sr[5] = new String("dinner");
        sr[6] = new String("brunch cafe");
        
        int sum1 = 0;
        
        for(int i = 0; i < sr.length; i++) {
            sum1 += sr[i].length();
        }
        
        int sum2 = 0;
        
        for (String string : sr) {
            sum2 += string.length();
        } // enhanced for문
        
        System.out.println("총 문자의 수 :" + sum1); // 총 문자의 수 :43
        System.out.println("총 문자의 수 :" + sum2); // 총 문자의 수 :43
        
        int[] ar = {1, 2, 3, 4, 5};
        
        Sum sum = new Sum();
        
        System.out.println(sum.sum(ar)); // 15
    }
}

class Sum{
    static int sum(int[] ar) {
        int sum = 0;
        
        for (int e : ar) {
            sum += e;
        }
        return sum;
    }
}