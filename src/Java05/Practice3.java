package Java05;

import java.util.Set;
import java.util.TreeMap;

public class Practice3 {
    public static void main(String[] args){
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(45, "Brown");
        map.put(37, "James");
        map.put(23, "Martin");

        Set<Integer> age = map.keySet();

        for (Integer i: age) {
            System.out.print(map.get(i) + "(" + i + ") ");
        }
    }
}
