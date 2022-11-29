package Java05;

import java.util.Scanner;
import java.util.TreeSet;

public class ArrayListTest2 {
    //Scanner 클래스로 -1이 입력될 때까지 양의 정수를 입력 받아 저장(List)하고 검색하여
    //가장 큰 수를 출력하는 프로그램을 작성하라.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        TreeSet<Integer> intList = new TreeSet<>();

        try {
            while (true){
                System.out.println("정수 입력 >");
                int input = sc.nextInt();

                intList.add(input);

                if(input == -1){
                    break;
                }
            }

            System.out.println("최대값 : " + intList.last());
        }catch (Exception e){
            e.printStackTrace();

            System.out.println("잘못 입력하셨습니다.");
        }
    }
}
