package Java03;

public class ExtendsTest {
    public static void main(String[] args){
        ColorTV myTV = new ColorTV(32, 1024);
        myTV.printProperty();
    }
}

class TV{
    private int size;
    public TV(int size){
        this.size = size;
    }
    protected int getSize(){
        return size;
    }
}

class ColorTV extends TV{
    int color;

    public ColorTV(int size, int color){
        super(size);
        this.color = color;
    }

    public void printProperty(){
        System.out.println(super.getSize() +"인치 "+ color+"컬러");
    }
}