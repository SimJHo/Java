package Java05;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Practice2 {
    public static void main(String[] args){
        HashMap<String, Double> gradeMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        try {
            for(int i = 0; i < 5; i++){
                System.out.print("이름과 학점>>");
                String name = sc.next();
                double grade = sc.nextDouble();

                gradeMap.put(name, grade);
            }
        }catch (Exception e){
            System.out.println("잘못 입력하셨습니다.");
            return;
        }

        try {
            double min;
            System.out.print("장학생 선발 학점 기준 입력>>");
            min = sc.nextDouble();

            Set<String> names = gradeMap.keySet();

            System.out.print("장학생 명단 : ");
            for (String name: names) {
                if(gradeMap.get(name) >= min){
                    System.out.print(name + " ");
                }
            }
        }catch (Exception e){
            System.out.println("잘못 입력하셨습니다.");
        }

    }
}
