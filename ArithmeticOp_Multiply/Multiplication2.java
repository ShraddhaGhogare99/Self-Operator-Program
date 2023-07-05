package ArithmeticOp_Multiply;

public class Multiplication2 {
    float mul2(float k, float l) {
        float g = k * l;
        return g;
    }

    public static void main(String[] args) {
        Multiplication2 mm = new Multiplication2();
        float into1 = mm.mul2(6.654f, 5.354f);
        System.out.println("multiply2=" + into1);
    }
}
