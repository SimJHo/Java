package Java06;

public class ThreadSyncTest {
    public static void main(String[] args){
        Runnable r = new Runnable2();

        // 같은 계좌 동시 출금
        new Thread(r).start();
        new Thread(r).start();
    }
}

class Account2 {
    private int balance = 1000; // private로 해야 동기화의 의미가 있다.

    public int getBalance(){
        return balance;
    }

    public synchronized void withdraw(int money){
        //synchronized 메소드로 동기화(이 함수에 동시 접근이 불가능하게 한다.)
        //임계영역: 두 개 이상의 쓰레드에서 동시에 실행되면 안되는 영역
        if(balance >= money){
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
            balance -= money;
        }
    }
}

class Runnable2 implements Runnable{
    Account2 acc = new Account2();

    @Override
    public void run() {
        while (acc.getBalance() > 0){
            // 100, 200, 300 중 임의이 값을 출금
            int money = (int)(Math.random() * 3 + 1) * 100;
            acc.withdraw(money);
            System.out.println("balance: " + acc.getBalance());
        }
    }
}