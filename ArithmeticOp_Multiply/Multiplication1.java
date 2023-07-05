package ArithmeticOp_Multiply;

public class Multiplication1 {

    int mul1(int k, int l) {
        int g = k * l;
        return g;
    }

    public static void main(String[] args) {
        Multiplication1 mm = new Multiplication1();
        int into = mm.mul1(654, 354);
        System.out.println("multiply1=" + into);
    }
}
