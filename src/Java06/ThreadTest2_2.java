package Java06;

import javax.swing.*;

public class ThreadTest2_2 {
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName());

        Thread3 th3 = new Thread3();
        th3.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
        System.out.println("입력하신 값은" + input + "입니다.");
    }
}

class Thread3 extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());

        for(int i = 10; i > 0; i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }
}