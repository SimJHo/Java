package Java05;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args){
        Queue<String> que = new LinkedList<>();

        que.offer("Box");
        que.offer("Toy");
        que.offer("Robot");

        System.out.println("Next : " + que.peek());

        System.out.println(que.poll());
        System.out.println(que.poll());

        System.out.println("Next : " + que.peek());

        System.out.println(que.poll());

        //Next : Box
        //Box
        //Toy
        //Next : Robot
        //Robot
    }
}
