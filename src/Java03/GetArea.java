package Java03;

public class GetArea{
    public static void main(String[] args){
        double sumArea = 0;

        Shape[] shape = {new Circle(10), new Triangle(10,10)};

        for ( Shape s : shape ) {
            sumArea += s.getArea();
        }

        System.out.println("총 넓이는 " + sumArea + "입니다.");

        Circle circle = new Circle(10);
        System.out.println(circle);
    }
}

class Shape{
    double getArea(){
        return 0.0;
    }
}

class Circle extends Shape{
    private int r;

    public Circle(int r){
        this.r = r;
    }
    @Override
    double getArea(){
        return r * r * Math.PI;
    }

    @Override
    public String toString(){
        return String.valueOf(getArea());
    }
}
class Triangle extends Shape{
    private int width, height;

    public Triangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea(){
        return width * height / 2.0;
    }
}