package ArithmeticOp_Div;

public class Division1 {

    float div1(float k, float f) {
        float j = k / f;
        return j;

    }

    public static void main(String[] args) {
        Division1 dd = new Division1();
        float Div1 = dd.div1(90.90f, 30.30f);
        System.out.println("divide1=" + Div1);
    }

}
