package Java05;

import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;

class MyLinkedList{
    int i;

    MyLinkedList myLinkedList;
}

public class ArrayListTest {
    public static void main(String[] args){
        MyLinkedList list1 = new MyLinkedList();
        list1.i = 1;

        MyLinkedList list2 = new MyLinkedList();
        list2.i = 1;

        list1.myLinkedList = list2; // LinkedList의 원리

        //============================================//

        List<String> list = new ArrayList<>();
//        List<String> list = new LinkedList<>(); = 같은 결과

        list.add("Toy");
        list.add("Box");
        list.add("Robot");

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();

        list.remove(0);

        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + "\t");
        }
    }
}
