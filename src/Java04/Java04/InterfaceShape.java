package Java04;

interface IShape{
    double getArea();
}

class Circles implements IShape{
    private int r;

    public Circles(int r){
        this.r = r;
    }

    @Override
    public double getArea() {
        return r * r * Math.PI;
    }
}

class Triangles implements IShape{
    private int width, height;

    public Triangles(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height / 2.0;
    }
}

class Rectangles implements IShape{
    private int width, height;

    public Rectangles(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) width * height;
    }
}

public class InterfaceShape {
    public static void main(String[] args){
        double sumArea = 0;

        IShape[] iShape = {new Circles(10), new Triangles(10,10), new Rectangles(10,10)};

        for (IShape s: iShape) {
            sumArea += s.getArea();
        }

        System.out.println(sumArea);
    }
}
