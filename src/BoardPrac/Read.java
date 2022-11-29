package BoardPrac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Read extends Start{
    public void read(ArrayList<HashMap<String, Object>> boardTable){
        Scanner sc = new Scanner(System.in);
        HashMap<String, Object> board = new HashMap<>();
        Update update = new Update();
        Delete delete = new Delete();

        System.out.println("조회 할 글번호 > ");
        int index = sc.nextInt();
        boolean output = false;

        for(int i = 0; i < boardTable.size(); i++){
            if(index == (int)(boardTable.get(i).get("Board_NO"))){
                System.out.println("=================================================================================================");
                System.out.println("글제목 : " + boardTable.get(i).get("Title"));
                System.out.println("-------------------------------------------------------------------------------------------------");
                System.out.println("작성자 : " + boardTable.get(i).get("User_Name"));
                System.out.println("-------------------------------------------------------------------------------------------------");
                System.out.println("작성일 : " + boardTable.get(i).get("Date"));
                System.out.println("-------------------------------------------------------------------------------------------------");
                System.out.println("글내용 : " + boardTable.get(i).get("Content"));
                System.out.println("=================================================================================================");

                board = boardTable.get(i);
                output = true;
            }
        }

        if(output == true){
            System.out.println("1.수정  2.삭제  5.목록 > ");
            int input = sc.nextInt();

            switch (input){
                case 1:
                    update.update(board);
                    break;
                case 2:
                    delete.delete(board, boardTable);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }
        }
        else{
            System.out.println("해당 게시글이 없습니다.");
        }
    }
}
