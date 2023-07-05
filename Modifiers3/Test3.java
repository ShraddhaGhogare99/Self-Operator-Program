package Modifiers3;

import Modifiers.Test1;
import Modifiers2.Test2;


public class Test3 extends Test2 {


    protected void method() {
        super.method();
    }

    public static void main(String[] args) {
        Test1 tt = new Test1();
        tt.one();

    }

}




