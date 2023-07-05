package ArithmeticOp_Modulus;

public class Modulus4 {

    int num1;
    int num2;
    int num;

    int mod4(int num1, int num2) {
        int num = num1 % num2;
        System.out.println("Mod=" + num);
        return num;

    }

    public static void main(String[] args) {
        Modulus4 mm = new Modulus4();
        mm.mod4(9874, 2561);

    }

}
