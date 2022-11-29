package Java06;

import java.io.*;

public class DataFilterIOStream {
    public static void main(String[] args){
        try(DataOutputStream out = new DataOutputStream(new FileOutputStream("data.dat"))) {
            out.writeInt(370); // int형 데이터 저장
            out.writeDouble(3.14); // double형 데이터 저장
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        try(DataInputStream in = new DataInputStream(new FileInputStream("data.dat"))) {
            int num1 = in.readInt(); // int형 데이터 꺼냄
            double num2 = in.readDouble(); // double형 데이터 꺼냄
            System.out.println(num1);
            System.out.println(num2);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
