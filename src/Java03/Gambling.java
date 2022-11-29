package Java03;

import java.util.Scanner;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String turn() {
        Scanner sc = new Scanner(System.in);
        System.out.print("["+name+"]:");
        return sc.nextLine();
    }

    public boolean RandomNum() {
        int num[] = new int[4];

        for(int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random()*3+1);
            System.out.print(num[i]+"\t");
        }

        boolean result = true;
        for(int i = 0; i < num.length; i++) {
            if(num[0] != num[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}

class GamblingGame {
    Scanner sc = new Scanner(System.in);
    int pCnt = sc.nextInt();
    Person person[] = new Person[pCnt];

    public GamblingGame() {
        for(int i = 0; i < person.length; i++) {
            System.out.print((i+1) + "번째 선수 이름>>");
            person[i] = new Person(sc.next());
        }
    }

    public void Run() {
        while(true) {
            for(int i = 0; i < person.length; i++) {
                String s = person[i].turn();
                if(s.equals("")) {
                    System.out.println("<Enter>");
                }
                else {
                    System.out.println("<Enter>키만 입력 가능합니다.");
                    return;
                }

                if(person[i].RandomNum()) {
                    System.out.println(person[i].getName() + "님이 이겼습니다!");
                    return;
                }
                else
                    System.out.println("아쉽군요!");
            }
        }
    }
}

public class Gambling {
    public static void main(String[] args){
        System.out.print("플레이어 수>>");
        GamblingGame game = new GamblingGame();
        game.Run();
    }
}