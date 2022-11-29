package java02.java02;

public class Circle {
	int radius; // 인스턴스 변수 (클래스 안, 메소드 밖)
	// int부터 4byte, 함수는 무조건 4byte 총 8byte 할당
	// JVM이 32bit이기 때문에 주소값은 4byte이다.
	double getArea() {
		return radius * radius * Math.PI;
	}
}

class Rectangle {
	
	int getArea(int num) {
		return num * num;
	}
}

class Sum {
	int sum = 0;
	
	int sumNum(int num) {
		for(int i=0; i<=num; i++) {
			sum = sum + i;
		}
		return sum;
	}
}

class StarPrint {
	int num;
	
	public StarPrint (int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public void getPrint() {
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void getPrint(int num) {
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

