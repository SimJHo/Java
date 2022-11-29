package Java03;

public class StarCraftUnit {
    public static void main(String[] args){
        Zealot zealotA = new Zealot(100,100,100,15);
        Zealot zealotB = new Zealot(100,100,100,15);

        zealotA.attack(zealotB);
        zealotA.showinfo();
        zealotB.showinfo();

        zealotA.attack(zealotB);
        zealotA.showinfo();
        zealotB.showinfo();

        zealotA.attack(zealotB);
        zealotA.showinfo();
        zealotB.showinfo();
    }
}

class Unit{
    private int hp;
    int nowhp;
    private int price;

    public Unit(int hp, int nowhp, int price){
        this.hp = hp;
        this.nowhp = nowhp;
        this.price = price;
    }

    public void move(){

    }

    public void showinfo(){
        System.out.println("현재 체력 : " + nowhp + "/ 최대 체력 : " + hp);
    }
}

class Zealot extends Unit{

    int damage;

    public Zealot(int hp, int nowhp, int price, int damage) {
        super(hp, nowhp, price);
        this.damage = damage;
    }

    public void attack(Unit unit){
        unit.nowhp -= damage;
    }

    public void patrol(){

    }
}