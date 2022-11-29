package Java04;

import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args){
        StringTokenizer st1 = new StringTokenizer("PM:01:45", ":");

        while (st1.hasMoreTokens())
            System.out.print(st1.nextToken() + ' ');
        System.out.println();

        StringTokenizer st2 = new StringTokenizer("12 + 38 - 8 / 2 = 44", "+-/= ");

        while (st2.hasMoreTokens())
            System.out.print(st2.nextToken() + ' ');
        System.out.println();

        //PM 01 45
        //12 38 8 2 44
    }
}
