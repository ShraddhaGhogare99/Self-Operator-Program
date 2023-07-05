package UnaryOp;

public class Test1 {

    public static void main(String[] args) {

        int aa=10;
        System.out.println("Increment"+(aa++));  //postincrement
        System.out.println(+(aa++));
        System.out.println(+(aa++));

        System.out.println(++aa);     //preincrement
        System.out.println(+(++aa));

        int bb=30;

        System.out.println("Decrement"+(bb--)); //postincrement
        System.out.println(bb--);

        System.out.println(--bb);  //predecrement
        System.out.println(--bb);


    }

}
