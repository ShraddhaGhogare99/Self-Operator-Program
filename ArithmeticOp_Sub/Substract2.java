package ArithmeticOp_Sub;

public class Substract2 {

    int Sub2(int v, int o, int k) {
        int z = v - o - k;
        return z;

    }

    public static void main(String[] args) {
        Substract2 tt = new Substract2();
        int sub = tt.Sub2(789, 456, 123);
        System.out.println("sub2=" + sub);

    }
}
