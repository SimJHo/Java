package Java04;

class Board{

}

class PBoard extends Board{

}

public class ClassCastExceptionTest {
    public static void main(String[] args){
        Board pbd1 = new PBoard();
        PBoard pbd2 = (PBoard)pbd1; // OK

        System.out.println(".. intermediate location ..");
        Board ebd1 = new Board();
        
        try {
            PBoard ebd2 = (PBoard)ebd1; // Exception
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println("에러");
        }
    }
}
