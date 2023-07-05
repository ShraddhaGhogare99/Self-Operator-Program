package ArithmeticOp_Modulus;

public class Modulus5 {

    int mod5(int q, int t) {
        int num = q % t;
        System.out.println("Mod=" + num);
        return num;
    }

    public static void main(String[] args) {
        Modulus5 ee = new Modulus5();
        ee.mod5(6548, 1254);

    }

}
