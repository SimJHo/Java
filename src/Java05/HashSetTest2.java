package Java05;

import java.util.HashSet;

class Person1{
    private String name;
    private int age;

    public Person1(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }

    @Override
    public int hashCode() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person1){
            if (name == ((Person1) obj).name) {
                return true;
            }
        }
        return false;
    }
}

public class HashSetTest2 {
    public static void main(String[] args){
        HashSet<Person1> hSet = new HashSet<>();

        hSet.add(new Person1("LEE", 10));
        hSet.add(new Person1("LEE", 10));
        hSet.add(new Person1("PARK", 35));
        hSet.add(new Person1("PARK", 35));

        System.out.println("저장된 데이터 수: " + hSet.size());
        System.out.println(hSet);
    }
}
