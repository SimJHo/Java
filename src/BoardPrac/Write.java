package BoardPrac;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Write extends Start{
    public void write(ArrayList<HashMap<String, Object>> boardTable){
        HashMap<String, Object> board = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int max = 0;
        for(int i = 0; i < boardTable.size(); i++){
            if(max < (int)boardTable.get(i).get("Board_NO")){
                max = (int)boardTable.get(i).get("Board_NO");
            }
        }

        board.put("Board_NO", max + 1);

        System.out.println("글제목 > ");
        board.put("Title", sc.nextLine());

        System.out.println("글내용 > ");
        board.put("Content", sc.nextLine());

        System.out.println("작성자 > ");
        board.put("User_Name", sc.nextLine());

        board.put("Date", new Date());

        boardTable.add(board);
        System.out.println("게시글이 등록되었습니다.");
    }
}