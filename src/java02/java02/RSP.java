package java02.java02;

import java.util.*;

public class RSP {
	public static void main(String[] args) {
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("가위, 바위, 보 중 하나를 입력해주세요 ");
			String rcp = sc.next();
			
			Game player = new Game(rcp);
			player.com();
			
			System.out.println("다시 하시겠습니까? (Y / N)");
			String yn = sc.next();
			
			if(yn.equals("n")) {
				break;
			}
		}
	}
}

class Game{
	String rcp;
	
	public Game(String rcp) {
		this.rcp = rcp;
	}
	
	private int random() {
		int com = (int)(Math.random()*3+1);
			
		return com;
	}
	
	public void com() {
		int com = random();
		if(rcp.equals("가위") && com == 1) {
			System.out.println("컴퓨터 : 가위, 비겼습니다.");
		}
		else if(rcp.equals("가위") && com == 2) {
			System.out.println("컴퓨터 : 바위, 졌습니다.");
		}
		else if(rcp.equals("가위") && com == 3) {
			System.out.println("컴퓨터 : 보, 이겼습니다.");
		}
		else if(rcp.equals("바위") && com == 1) {
			System.out.println("컴퓨터 : 가위 , 이겼습니다.");
		}
		else if(rcp.equals("바위") && com == 2) {
			System.out.println("컴퓨터 : 바위, 비겼습니다.");
		}
		else if(rcp.equals("바위") && com == 3) {
			System.out.println("컴퓨터 : 보, 졌습니다.");
		}
		else if(rcp.equals("보") && com == 1) {
			System.out.println("컴퓨터 : 가위 , 졌습니다.");
		}
		else if(rcp.equals("보") && com == 2) {
			System.out.println("컴퓨터 : 바위, 이겼습니다.");
		}
		else if(rcp.equals("보") && com == 3){
			System.out.println("컴퓨터 : 보, 비겼습니다.");
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
}
