package ArithmeticOp_Modulus;

public class Modulus2 {
    float numB = 9.056f;
    float numA = 2.345f;
    float num;

    void mod2() {
        float num = numB % numA;
        System.out.println("Mod=" + num);
    }

    public static void main(String[] args) {
        Modulus2 ss = new Modulus2();
        ss.mod2();

    }


}
