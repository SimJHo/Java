package Java04;

class CircleArea{
    int r;

    public CircleArea(int r){
        this.r = r;
    }

    public double getArea(){
        return r * r * Math.PI;
    }

    public String toString(){
        return "넓이는 " + getArea() + "입니다.";
    }
}

public class CircleObject {
    public static void main(String[] args){
        Object obj = new CircleArea(10);
        System.out.println(obj);
        // 넓이는 314.1592653589793입니다.
    }
}
