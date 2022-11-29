package BoardPrac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Delete {
    public void delete(HashMap<String, Object> board, ArrayList<HashMap<String, Object>> boardTable){
        Scanner sc = new Scanner(System.in);

        System.out.println("게시글을 삭제하시겠습니까? (1.네 / 2.아니오)");
        int input = sc.nextInt();

        switch (input){
            case 1:
                for(int i = 0; i < boardTable.size(); i++){
                    if(board.get("Board_NO") == boardTable.get(i).get("Board_NO")){
                        boardTable.remove(i);
                        System.out.println("게시글이 삭제되었습니다.");
                        break;
                    }
                }
                break;
            default:
                break;
        }
    }
}
