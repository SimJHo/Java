package Java05;

import java.util.HashSet;

class Num1{
    int num;

    public Num1(int num){
        this.num = num;
    }

    @Override
    public String toString(){
        return String.valueOf(num);
    }

    @Override
    public int hashCode(){
        return num % 3;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Num1){
            if(this.num == ((Num1) obj).num){
                return true;
            }
        }
        return false;
    }
}

public class Timer {
    public static void main(String[] args){
        HashSet<Num1> set = new HashSet<>();
        set.add(new Num1(7799));
        set.add(new Num1(9955));
        set.add(new Num1(7799));

        System.out.println("인스턴스 수: " + set.size());

        for(Num1 n : set)
            System.out.print(n.toString() + '\t');

        System.out.println();

/*
====출력
인스턴스 수: 2
7799        9955
*/
    }
}
