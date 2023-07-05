package ArithmeticOp_Sub;

public class Substract1 {

    int Sub1(int a, int b) {
        int c = a - b;
        return c;

    }

    public static void main(String[] args) {
        Substract1 ss = new Substract1();
        int sub = ss.Sub1(153, 87);
        System.out.println("sub1=" + sub);

    }
}