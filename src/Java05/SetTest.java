package Java05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();

        set.add("Toy");
        set.add("Box");
        set.add("Box");
        set.add("Robot");

        System.out.println("인스턴스 수" + set.size());

        for(Iterator<String> itr = set.iterator(); itr.hasNext();){
            System.out.print(itr.next() + "\t");
        }
        System.out.println();

        for (String s: set) {
            System.out.print(s + "\t");
        }
        System.out.println();

        //인스턴스 수3
        //Box	Robot	Toy
        //Box	Robot	Toy

        //===================================//

        //Lotto
        Set<Integer> lotto = new HashSet<>();

        while(lotto.size() <= 6){
            lotto.add((int)(Math.random()*45+1));
        }
        for(Integer i: lotto){
            System.out.print(i + "\t");
        }
    }
}
