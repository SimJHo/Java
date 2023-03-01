package Java04;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args){
        Random rand = new Random();

        for(int i = 0; i < 7; i++){
            System.out.println(rand.nextInt(1000));
        }

        //Random rand = new Random(12);
        //위와 같이 Random()에 seed를 넣고 실행하면
        //반복해도 같은 수가 출력된다.
    }
}
