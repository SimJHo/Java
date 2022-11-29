package java02.java02;

import java.util.*;

public class timer {
	public static void main(String[] args) {
		Sing song = new Sing();
        song.getSong("1978", "스웨덴", "ABBA", "DancingQueen");
        
        SumNumber sumNumber = new SumNumber();
        System.out.println(sumNumber.sumNumber(10));
        
        TV tv = new TV();
        tv.tv("LG", "2017", "32");
        
        Dan dan = new Dan();
        dan.dan(10);
        dan.dan(20);
        
        // 입력        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
        int math = sc.nextInt();
        int science = sc.nextInt();
        int english = sc.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println(me.average());
    }
}

class Sing{
	String year;
	String country;
	String artist;
	String title;
	
	public void getSong(String year, String country, String artist, String title) {
		this.year = year;
		this.country = country;
		this.artist = artist;
		this.title = title;
		
		System.out.println( year + country + artist + title);
	}
	
}

class SumNumber{
	int num;
	int sum;
	
	public int sumNumber(int num) {
		for(int i = 0; i<= num ; i++) {
			sum += i;
		}
		return sum;
	}
	
}

class TV{
	String brand;
	String year;
	String inch;
	
	public void tv(String brand, String year, String inch) {
		this.brand = brand;
		this.year = year;
		this.inch = inch;
		
		System.out.println( year +"년형 "+ brand +""+ inch+"인치 TV");
	}
}

class Dan{
	
	public void dan(int num) {
		for(int i = 1; i<= num ; i++) {
			for(int j= 2; j <= 9 ; j++) {
				System.out.println(i + " x " + j +" = " +(i*j));
			}
		}
	}
}

class Grade{
	int math;
	int science;
	int english;
	
	private double avg; 
	public Grade(int math2, int science2, int english2) {
		this.math = math2;
		this.science = science2;
		this.english = english2;
	}
	public String average() {
		avg = (math + science + english)/3.0;
		System.out.println("평균은 " + avg + "점 이고" );
		if(avg >= 90) {
			return "수 입니다";
		}
		else if(avg >= 80) {
			return "우 입니다";
		}
		else if(avg >= 70) {
			return "미 입니다";
		}
		else if(avg >= 60) {
			return "양 입니다";
		}
		else {
			return "가 입니다";
		}
	}
}


