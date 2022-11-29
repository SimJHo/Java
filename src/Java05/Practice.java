package Java05;

import java.util.HashMap;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args){
        HashMap<String, Integer> nationMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
        try {
            while (true){
                System.out.print("나라 이름, 인구 >>");
                String con = sc.next();

                if (con.equals("그만")){
                    String buf = sc.nextLine(); //입력 버그
                    break;
                }

                int pop = sc.nextInt();

                nationMap.put(con, pop);
            }

            while (true){

                System.out.print("인구 검색 >>");
                String input = sc.nextLine();

                if (input.equals("그만")){
                    break;
                }
                else if (nationMap.containsKey(input)){
                    System.out.println(input + "의 인구는 " + nationMap.get(input));
                }
                else{
                    System.out.println(input + "이라는 나라는 없습니다.");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}
