package ArithmeticOp_Modulus;

public class Modulus3 {
    float S = 8.964f;
    float G = 3.214f;
    float W;

    void mod3() {
        float W = S % G;
        System.out.println("Mod=" + W);
    }

    public static void main(String[] args) {
        Modulus3 ll = new Modulus3();
        ll.mod3();

    }

}
