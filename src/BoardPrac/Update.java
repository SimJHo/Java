package BoardPrac;

import java.util.HashMap;
import java.util.Scanner;

public class Update {
    public void update(HashMap<String, Object> board){
        Scanner sc = new Scanner(System.in);

        System.out.println("글제목: ");
        board.put("Title", sc.nextLine());

        System.out.println("글내용: ");
        board.put("Content", sc.nextLine());

        System.out.println("게시글이 수정되었습니다.");
    }
}
