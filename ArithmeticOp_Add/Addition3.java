package ArithmeticOp_Add;

public class Addition3 {

    int add3(int u, int v) {
        return u + v;

    }
}

class NewAddition {

    int add4(int r, int h) {
        return r + h;
    }

    public static void main(String[] args) {
        Addition3 ii = new Addition3();
        int add = ii.add3(75885, 6326);
        System.out.println("add3=" + add);

        NewAddition nn = new NewAddition();
        int add2 = nn.add4(6584, 3124);
        System.out.println("add4=" + add2);

    }
}
