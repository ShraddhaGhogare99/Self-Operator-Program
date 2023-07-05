package ArithmeticOp_Div;

public class Division3 {

    void div3(int l, int e, int t) {
        int h = (l / e) / t;
        System.out.println("divide3=" + h);

    }

    public static void main(String[] args) {
        Division3 ss = new Division3();
        ss.div3(96587, 6542, 12);
    }
}
