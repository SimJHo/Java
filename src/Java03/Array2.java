package Java03;

public class Array2 {
    public static void main(String[] args){
        int[][] arr = {
            {11},
            {44,55},
            {77,88,99}
        };

        System.out.println(arr[0]);
        // [I@5594a1b5 (주소값)

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        // 11
        // 44 55
        // 77 88 99

        // for문으로 2차원 배열에 값넣기
        int[][] arr2 = new int[4][4];
        int num = 1;

        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = num++;
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }
        // 1  2  3  4
        // 5  6  7  8
        // 9  10 11 12
        // 13 14 15 16

        int[][] arr3 = new int[4][4];
        int num2 = 16;

        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = num2--;
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }
        // 16 15 14 13
        // 12 11 10 9
        // 8  7  6  5
        // 4  3  2  1
    }
}
