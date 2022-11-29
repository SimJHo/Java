package BoardPrac;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Start{
    ArrayList<HashMap<String, Object>> boardTable = new ArrayList<>();
    private final int pageSize = 5;
    private int page = 1;
    public void start() {
        Write write = new Write();
        Read read = new Read();
        Scanner sc = new Scanner(System.in);

        try {
            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Sim\\BoardData2.txt"))) {
                boardTable = (ArrayList<HashMap<String, Object>>)ois.readObject();
            }
            catch(IOException e) {
                e.printStackTrace();
            }

            while (true){

                System.out.println("=================================================================================================");
                System.out.println("번호 |              글제목             |        작성자         |          작성일");
                System.out.println("-------------------------------------------------------------------------------------------------");
                for(int i = boardTable.size() - (1+(pageSize * (page - 1))); i >= boardTable.size() - (pageSize * (page)); i-- ){
                    if(i < 0){
                        break;
                    }
                    System.out.print(String.format("%-3s", boardTable.get(i).get("Board_NO")) + " | ");
                    System.out.print(String.format("%-30s", boardTable.get(i).get("Title")) + " | ");
                    System.out.print(String.format("%-20s", boardTable.get(i).get("User_Name")) + " | ");
                    System.out.println(boardTable.get(i).get("Date"));
                }
                System.out.println("-------------------------------------------------------------------------------------------------");
                System.out.println("현재 페이지 : " + page + " | 전체 페이지 : " + ((boardTable.size() / pageSize) + 1));
                System.out.println("=================================================================================================");
                System.out.println("1.조회  2.글작성  3.페이지이동  5.종료 > ");

                int input = sc.nextInt();

                switch (input){
                    case 1:
                        if(boardTable.size() == 0){
                            System.out.println("게시글이 없습니다.");
                            break;
                        }
                        read.read(boardTable);
                        break;
                    case 2:
                        write.write(boardTable);
                        break;
                    case 3:
                        while (true){
                            System.out.println("총 페이지 : 1 ~ " + ((boardTable.size() / pageSize) + 1) + " | 이동할 페이지 번호 >" );

                            try {
                                page = sc.nextInt();

                                if(page <= 0 || page > ((boardTable.size() / pageSize) + 1)){
                                    System.out.println("잘못된 페이지 번호입니다.");
                                }else {
                                    break;
                                }
                            }catch (Exception e){
                                System.out.println("잘못된 페이지 번호 입니다.");
                                start();
                            }
                        }
                        break;
                    case 5:
                        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Sim\\BoardData2.txt"))) {
                            oos.writeObject(boardTable);
                        }
                        catch(IOException e) {
                            e.printStackTrace();
                        }

                        System.out.println("프로그램을 종료합니다.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("잘못 입력하셨습니다.");
                        break;
                }
            }
        }catch (Exception e){
            System.out.println("잘못 입력하셨습니다.");
            start();
        }finally {
            System.out.println("프로그램이 종료되었습니다.");
        }
    }
}