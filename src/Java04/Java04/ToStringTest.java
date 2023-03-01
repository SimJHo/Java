package Java04;

class Cake {
    // Object 클래스의 toString 메소드를 오버라이딩
    public String toString() {
        return "My birthday cake";
    }
}

class CheeseCake extends Cake {
    // Cake 클래스의 toString 메소드를 오버라이딩
    public String toString() {
        return "My birthday cheese cake";
    }
}

public class ToStringTest {
    public static void main(String[] args){
        Cake cake = new Cake();
        System.out.println(cake);
        // My birthday cake

        Cake cake1 = new CheeseCake();
        System.out.println(cake1);
        // My birthday cheese cake

        CheeseCake cake2 = new CheeseCake();
        System.out.println(cake2);
        // My birthday cheese cake
    }
}
