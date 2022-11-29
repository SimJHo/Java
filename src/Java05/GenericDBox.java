package Java05;

class DBox<L, R>{
    private L left;
    private R right;

    public void set(L l, R r) {
        left = l;
        right = r;
    }

    @Override
    public String toString(){
        return left + " & " + right;
    }
}

public class GenericDBox {
    public static void main(String[] args){
        DBox<String, Integer> box = new DBox<>();

        box.set("Apple", 25);

        System.out.println(box);
    }
}
