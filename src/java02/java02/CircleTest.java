package java02.java02;

public class CircleTest {
	public static void main(String[] args) {
		
		Circle circle = new Circle(); // 객체 생성( Circle(): 생성자)
		// data type : 참조형 = 4byte (주소값이 들어가기 때문에)
		// new : 메모리 할당 = 허리(heap)영역에
		circle.radius = 10;
		System.out.println(circle.getArea());
		//----------------------------------//
		
		Circle circle2 = new Circle();
		
		circle2.radius = 5;		
		System.out.println(circle2.getArea());
		//----------------------------------//
		
		Circle circle3 = new Circle();
		
		circle3.radius = 7;		
		System.out.println(circle3.getArea());	
		//----------------------------------//
		
		Rectangle rectangle = new Rectangle();
		System.out.println(rectangle.getArea(10));
		//----------------------------------//
		
		Sum sum = new Sum();
		System.out.println(sum.sumNum(10));
		//----------------------------------//
		
		StarPrint starprint = new StarPrint(3);
		starprint.getPrint();
		
		starprint.getPrint(4);
		//----------------------------------//
		
		
		
	}
}
