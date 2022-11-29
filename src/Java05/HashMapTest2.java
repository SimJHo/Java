package Java05;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest2 {
    public static void main(String[] args){
        HashMap<String, Integer> nationMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("나라 이름과 인구를 입력해주세요.");

        try {
            for (int i = 0; i < 5; i++){
                System.out.print("나라 이름, 인구 >> ");

                nationMap.put(sc.next(), sc.nextInt());
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
            return;
        }

        Set<String> key = nationMap.keySet();

        int pop = 0;
        String con = null;

        for (String str: key) {
            if(nationMap.get(str) > pop ){
                pop = nationMap.get(str);
                con = str;
            }
        }

        System.out.println("제일 인구가 많은 나라는 (" + con +" , "+ pop + ")");
    }
}
