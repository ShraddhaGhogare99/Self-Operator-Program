package UnaryOp;

public class Test3 {
    int x=20;
    int y=40;
    void one(){
        boolean bb=(x<y);
        System.out.println(bb);

    }

    void two(){
        boolean ll=!(x<y);
        System.out.println(ll);

    }

    public static void main(String[] args) {

        Test3 ref=new Test3();
        ref.one();
        ref.two();
    }
}
