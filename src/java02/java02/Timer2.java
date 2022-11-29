package java02.java02;

import java.util.*;

public class Timer2 {
	public static void main(String[] args) {
		// charAt을 사용해서 문자열 거꾸로 출력
		String word;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력");
		word = sc.next();
		
		for(int i = word.length()-1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
		
		
		// 문자열의 자음과 모음의 수 구하기
		int consonant = 0;
		int vowel = 0;
		
		String word2;
		
		Scanner sc2 = new Scanner(System.in);
		word2 = sc2.nextLine();
		
		for(int i = 0; i < word2.length(); i++) {
			char ch = word2.charAt(i);
			
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowel++;
				break;
			case ' ':
				break;
			default:
				consonant++;
				break;
			}
		}
		System.out.println("총 글자수: " + word2.length());
		System.out.println("자음의 수: " + consonant);
		System.out.println("모음의 수: " + vowel);
		
		
		// 좌표가 주어진 사각형의 면적과 포함여부
		Rectangle2 r = new Rectangle2(2, 2, 8, 7);
		Rectangle2 s = new Rectangle2(5, 5, 6, 6);
		Rectangle2 t = new Rectangle2(1, 1, 10, 10);
		
		r.show();
		System.out.println("s의 면적은 "+s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
		
		// (2,2)에서 크기가 8x7인 사각형
		// s의 면적은 36
		// t는 r을 포함합니다.
 	}
}

class Rectangle2{
	private int x, y, width, height;
	
	public Rectangle2(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void show() {
		System.out.println("("+ x + ","+ y +")에서 크기가 "+ width +"x" + height + "인 사각형");
	}
	
	public int square() {
		return width*height;
	}
	
	public boolean contains(Rectangle2 r) {
		
		if(x < r.x && y < r.y && x+width > r.x+r.width && y+height > r.y+r.height) {
			return true;
		}
		else {
			return false;
		}
	}
}