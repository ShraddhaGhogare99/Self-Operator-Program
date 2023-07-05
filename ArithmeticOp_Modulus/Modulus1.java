package ArithmeticOp_Modulus;

public class Modulus1 {

    int num1 = 90;
    int num2 = 30;
    int num;

    void mod1() {
        int num = num1 % num2;
        System.out.println("Mod=" + num);
    }

    public static void main(String[] args) {
        Modulus1 mm = new Modulus1();
        mm.mod1();

    }

}
