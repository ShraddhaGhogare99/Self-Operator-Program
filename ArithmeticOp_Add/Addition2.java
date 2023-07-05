package ArithmeticOp_Add;

public class Addition2 {

    int add2(int w, int x, int y) {
        return (w + x + y);

    }

    public static void main(String[] args) {
        Addition2 dd = new Addition2();
        int add = dd.add2(90, 60, 40) - 10;
        System.out.println("Add2=" + add);
    }
}

