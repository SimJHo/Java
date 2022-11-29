package Java05;

import java.util.HashMap;
import java.util.Scanner;

//HashMap<String, Integer> 컬렉션을 생성하고
//“에스프레소”는 2000, “아메리카노”는 2500, “카푸치노”는 3000, “카페라테”는 3500을 저장하라.
//그리고 다음과 같이 음료수 이름을 입력받으면 HashMap에서 검색하여 가격을 출력하라.
public class HashMapTest {
    public static void main(String[] args){
        HashMap<String, Integer> menu = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        menu.put("에스프레소", 2000);
        menu.put("아메리카노", 2500);
        menu.put("카푸치노", 3000);
        menu.put("카페라떼", 3500);

        while (true){
            try {
                System.out.print("주문 > ");
                String input = sc.nextLine();

                if(input.equals("그만")){
                    break;
                }

                if(menu.get(input) == null){
                    System.out.println("없는 메뉴 입니다.");
                }else {
                    System.out.println(input + "는 " + menu.get(input) + "원 입니다.");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
