package java02.java02;

public class Circle2 {
    public static void main(String[] args){
        Circles[] arrCircle = {new Circles(10), new Circles(20)};

        double sumArea = sumCircles(arrCircle);

        System.out.println(sumArea);
    }

    static double sumCircles(Circles[] arrCircle){
        double sum = 0;
        for(int i=0; i<arrCircle.length; i++){
            sum += arrCircle[i].getArea();
        }
        return sum;
    }
}

class Circles{
    private int radius;

    public Circles(int radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
}