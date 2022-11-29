package java02.java02;

import java.util.*;

public class RSP2 {
	public static void main(String[] args) {
		while(true) {
			System.out.println("가위 바위 보 중 하나를 입력해주세요.");
			Scanner sc = new Scanner(System.in);
			String rsp = sc.next(); // 키보드 입력 받음
			
			if(!rsp.equals("가위") && !rsp.equals("바위") && !rsp.equals("보")) {
				//가위도 아니고 바위도 아니고 보도 아니면
				System.out.println("잘못 입력하셨습니다.");
				continue; //다시 while문 처음으로
			}
				
			RSPPlayer you = new RSPPlayer(rsp); // 두번째 생성자
			RSPPlayer computer = new RSPPlayer(); // 첫번째 생성자
			
			computer.result(you); //두번째 생성자.result(첫번째 생성자)
			
			System.out.println("계속 하시겠습니까? (네/아니오)");
			
			boolean isContinue = true;
			
			while(true) {
				String yesno = sc.next(); // 예 아니오 입력 받음
				
				if(yesno.equals("네")) {
					System.out.println("다시 시작합니다.");
					break; // '네'면 이 while문을 끝내고 상위 while문으로
				}else if(yesno.equals("아니오")) {
					System.out.println("게임을 종료합니다.");
					isContinue = false; // '아니오'면 isContinue를 false로 바꾸고
					break; // while문 빠져나감
				}else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				} // 잘못 입력하면 다시 하위 while문 실행
			}
			
			if(!isContinue) {
				break; // '아니오'입력으로 false로 바뀌었기 때문에 상위 while문도 빠져나감
			}
		}
	}
}

class RSPPlayer{
	private int rsp; //전역변수
	
	public RSPPlayer() {            // 첫번째 생성자 = computer
		rsp = (int)(Math.random()*3 + 1); // 랜덤으로 1,2,3 중 하나 생성
	}
	
	public RSPPlayer(String str) {  // 두번째 생성자 = you
		if(str.equals("가위")) {     // 나의 입력을 숫자로 바꿈
			rsp = 1;
		}
		else if(str.equals("바위")) {
			rsp = 2;
		}
		else {
			rsp = 3;
		}
	}
	
	private String getRSPString(int rsp) { // result의 프린트를 위한 함수
		String str = "";                   // 숫자를 다시 문자로 바꿈

		if (rsp == 1)
			str = "가위";
		else if (rsp == 2)
			str = "바위";
		else
			str = "보";

		return str; //스트링 반환
	}

	public void result(RSPPlayer you) { // RSPPlayer타입의 변수 받음

		System.out.println("나는:" + getRSPString(rsp) + " 당신은:" + getRSPString(you.rsp));
		//문자로 바꾼것을 출력
		if (rsp == you.rsp) {  // 숫자 비교
			System.out.println("비겻습니다.");
			return;
		}

		// 1 = 가위, 2 = 바위, 3 = 보
		if (this.rsp == 1 && you.rsp == 2) {
			System.out.println("제가 졌습니다.");
		} else if (this.rsp == 1 && you.rsp == 3) {
			System.out.println("제가 졌습니다.");
		} else if (this.rsp == 2 && you.rsp == 1) {
			System.out.println("제가 이겼습니다.");
		} else if (this.rsp == 2 && you.rsp == 3) {
			System.out.println("제가 졌습니다.");
		} else if (this.rsp == 3 && you.rsp == 1) {
			System.out.println("제가 졌습니다.");
		} else if (this.rsp == 3 && you.rsp == 2) {
			System.out.println("제가 이겼습니다.");
		}

	}
}