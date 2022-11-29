package Java05;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackTest {
    public static void main(String[] args){
        Deque<String> deq = new ArrayDeque<>();

        deq.offerFirst("1. Box");
        deq.offerFirst("2. Toy");
        deq.offerFirst("3. Robot");

        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());
        System.out.println(deq.pollFirst());

        //3. Robot
        //2. Toy
        //1. Box
    }
}
