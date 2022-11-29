package java02.java02;

public class Lotto2 {
    public static void main(String[] args){

        int[] arrLotto = makeLotto();

        for (int num: arrLotto) {
            System.out.println(num);
        }
    }

    public static int[] makeLotto(){
        int[] makeLotto = new int[6];

        for(int i = 0; i < makeLotto.length; i++) {
            makeLotto[i] = (int)(Math.random()*45)+1;

            for(int j = 0; j < i; j++) {
                if(makeLotto[i] == makeLotto[j]) {
                    i--;
                    break;
                }
            }
        }
        return makeLotto;
    }
}