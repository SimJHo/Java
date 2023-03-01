package Java04;

import java.util.Scanner;

class Player{
    Scanner sc = new Scanner(System.in);

    public int tern(){
        System.out.print("숫자를 입력해주세요 : ");
        return sc.nextInt();
    }
}

class Game{
    int ranNum = (int)(Math.random()*100+1);

    Player player = new Player();

    public void run(){
        while (true){
            System.out.println("게임 시작 1 입력");
            System.out.println("게임 종료 2 입력");
            Scanner sc = new Scanner(System.in);
            int start = sc.nextInt();

            if(start == 1){
                for (int i = 10; i > 0; i--) {
                    int inputNum = player.tern();

                    if (inputNum > ranNum) {
                        System.out.println("Down ===> " + (i - 1) + "번 남았습니다.");
                    } else if (inputNum < ranNum) {
                        System.out.println("Up ===> " + (i - 1) + "번 남았습니다.");
                    } else {
                        System.out.println("일치");
                        break;
                    }
                }
            }
            else if (start == 2){
                System.out.println("게임을 종료합니다.");
                break;
            }
            else{
                System.out.println("잘못 입력하셨습니다.");
            }
        }

    }
}

public class UpDownGame {
    public static void main(String[] args){
        Game game = new Game();

        game.run();
    }
}
