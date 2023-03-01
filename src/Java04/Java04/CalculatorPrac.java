package Java04;

import java.util.Scanner;

abstract class Calculate{
    abstract int calculate();
}

class Add extends Calculate{
    int num1, num2;

    public Add(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    int calculate() {
        return num1 + num2;
    }
}

class Sub extends Calculate{
    int num1, num2;

    public Sub(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    int calculate() {
        return num1 - num2;
    }
}

class Mul extends Calculate{
    int num1, num2;

    public Mul(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    int calculate() {
        return num1 * num2;
    }
}

class Div extends Calculate{
    int num1, num2;

    public Div(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    int calculate() {
        return num1 / num2;
    }
}

public class CalculatorPrac {
    public static void main(String[] args){
        int num1,num2;
        String oper;

        Scanner sc = new Scanner(System.in);
        System.out.println("계산할 두 정수와 연산자 입력");

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        oper = sc.next();

        Add add = new Add(num1,num2);
        Sub sub = new Sub(num1,num2);
        Mul mul = new Mul(num1,num2);
        Div div = new Div(num1,num2);

        if(oper.equals("+")){
            System.out.println(add.calculate());
        }
        else if(oper.equals("-")){
            System.out.println(sub.calculate());
        }
        else if(oper.equals("*")){
            System.out.println(mul.calculate());
        }
        else if(oper.equals("/")){
            System.out.println(div.calculate());
        }
    }
}
