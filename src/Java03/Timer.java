package Java03;

public class Timer {
    public static void main(String[] args){

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("문자열 입력");
//
//        String str = sc.next();
//
//        for(int i = str.length()-1; i >= 0; i--){
//            System.out.print(str.charAt(i));
//        }

//------------------------------------------------------------------------------------

//        String[] sr = new String[7];
//
//        sr[0] = new String("Java");
//        sr[1] = new String("System");
//        sr[2] = new String("Compiler");
//        sr[3] = new String("Park");
//        sr[4] = new String("Tree");
//        sr[5] = new String("Dinner");
//        sr[6] = new String("Brunch Cafe");
//
//        int sum = 0;
//        for(int i = 0; i < sr.length; i++){
//            sum += sr[i].length();
//        }
//        System.out.println(sum);

//------------------------------------------------------------------------------------

//        int[] lottoArr = new int[6];
//
//        for(int i = 0; i<lottoArr.length; i++){
//            lottoArr[i] = (int)((Math.random()*45)+1);
//
//            for(int j = 0; j < i; j++){
//                if(lottoArr[i] == lottoArr[j]){
//                    i--;
//                    break;
//                }
//            }
//        }
//        for (int num :  lottoArr) {
//            System.out.println(num);
//        }

//------------------------------------------------------------------------------------

//        int[][] arr = new int[4][4];
//        int num = 1;
//
//        for(int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr[i].length; j++){
//                arr[i][j] = num++;
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println();
//        }

//------------------------------------------------------------------------------------

//        String word = "Hello.java";
//        int index = word.indexOf(".");
//
//        System.out.println(index);
//
//        String fileName = word.substring(0,index);
//
//        System.out.println(fileName);
//
//        String extention = word.substring((index+1));
//
//        System.out.println(extention);

//------------------------------------------------------------------------------------

//        Scanner sc = new Scanner(System.in);
//
//        int row;
//        int col;
//
//        System.out.print("행 크기 : ");
//        row = sc.nextInt();
//
//        System.out.print("열 크기 : ");
//        col = sc.nextInt();
//
//        char[][] arr = new char[row][col];
//
//        for(row = 0; row < arr.length; row++){
//            for(col = 0; col < arr[row].length; col++){
//                arr[row][col] = (char)(Math.random()*26 + 65);
//                System.out.print(arr[row][col] + "\t");
//            }
//            System.out.println();
//        }

//------------------------------------------------------------------------------------


        Regul regul = new Regul("123", 123, "123","123");
        Temp temp = new Temp("456", 456, "456","456", 50, 10000);


        regul.sale(50);
        regul.printInfo();
        temp.printInfo();
    }
}

class Empl{
    String name;
    int age;
    String addr;
    String depa;
    int sale;

    public Empl(String name, int age, String addr, String depa){
        this.name = name;
        this.age = age;
        this.addr = addr;
        this.depa = depa;
    }

    public void printInfo() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + addr);
        System.out.println("부서 : " + depa);
    }
}

class Regul extends Empl{

    public Regul(String name, int age, String addr, String depa) {
        super(name, age, addr, depa);
    }

    public void sale(int sale){
        super.sale = sale;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("정규직");
        System.out.println("월급 : " + super.sale);
    }
}

class Temp extends Empl{
    int workTime;
    int timeSale;
    public Temp(String name, int age, String addr, String depa, int workTime, int timeSale) {
        super(name, age, addr, depa);
        this.workTime = workTime;
        this.timeSale = timeSale;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("비정규직");
        System.out.println("일한시간 : " + workTime);
        System.out.println("월급 : " + workTime * timeSale);
    }
}