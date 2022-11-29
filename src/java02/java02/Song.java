package java02.java02;

class Main {
	
	private String title;
	private String artist;
	private int year;
	private String country;
	
	public Main(int year, String country, String artist, String title ) {
		this.year = year;
		this.country = country;
		this.artist = artist;
		this.title = title;
	}
	
	public void show() {
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
	
	public void show(int year, String country, String artist, String title) {
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
}

public class Song{
	public static void main(String[] args) {
		Main song = new Main(1978, "스웨덴", "ABBA", "Dancing Queen");
		
		song.show();
		song.show(1978, "스웨덴", "ABBA", "Dancing Queen");
	}
}