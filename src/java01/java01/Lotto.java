package java01.java01;

public class Lotto {
    public static void main(String[] args) {
    
        random();
      
    }
    
    public static int[] random() {
        int[] lottoArr = new int[6];
        
        for(int i = 0; i < lottoArr.length; i++) {
            lottoArr[i] = (int)(Math.random()*45)+1;
            
            for(int j = 0; j < i; j++) {
                if(lottoArr[i] == lottoArr[j]) {
                    i--; // 다시 같은 자리로 돌려주기 위함
                    break;
                }
            }
        }
        
        for (int num : lottoArr) {
            System.out.println(num);
        }
        return lottoArr;
    }
}
