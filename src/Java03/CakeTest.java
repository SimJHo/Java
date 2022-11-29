package Java03;

public class CakeTest {
    public static void main(String[] args){
        CheeseCake ca1 = new CheeseCake();
        Cake ca2 = ca1;

        Cake ca3 = new CheeseCake();
        CheeseCake ca4 = (CheeseCake) ca3; //형변환하면 가능

        ca1.yummy(); // Yummy Cheese Cake
        ca3.yummy(); // Yummy Cheese Cake
        // 자식이 부모의 함수를 덮어쓴다.(=선언. '리턴타입, 함수이름, 파라미터'는 같고 바디만 달리한다.)

        Cake ca5 = new StrawberryCheeseCake();
        CheeseCake ca6 = new StrawberryCheeseCake();
        StrawberryCheeseCake ca7 = new StrawberryCheeseCake();

        ca5.yummy(); // Yummy Strawberry Cheese Cake
        ca6.yummy(); // Yummy Strawberry Cheese Cake
    }
}

class Cake{
    public void yummy(){
        System.out.println("Yummy Cake");
    }
}

class CheeseCake extends Cake{
    @Override
    public void yummy(){
        System.out.println("Yummy Cheese Cake");
    }
}

class StrawberryCheeseCake extends CheeseCake{
    @Override
    public void yummy(){
        System.out.println("Yummy Strawberry Cheese Cake");
    }
}
