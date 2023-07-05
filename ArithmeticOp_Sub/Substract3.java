package ArithmeticOp_Sub;

public class Substract3 {

    int Sub3(int k, int e, int l) {
        int i = k - e - l;
        return i;

    }

}

class NewSubstract {

    int Sub4(int p, int q, int r) {
        int s = p - q - r;
        return s;

    }

    public static void main(String[] args) {
        Substract3 cc = new Substract3();
        int sub = cc.Sub3(9456, 8214, 7896);
        System.out.println("sub3=" + sub);

        NewSubstract nn = new NewSubstract();
        int sub4 = nn.Sub4(6325, 4569, 3215);
        System.out.println("sub4=" + sub4);

    }
}