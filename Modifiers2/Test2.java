package Modifiers2;

import Modifiers.Test1;
class First{

    protected void three(){

        System.out.println("default");
    }

    protected class A {

        protected void AA(){
            System.out.println("Protected class n method");

        }
    }
}
public class Test2 {

    protected void method(){

        System.out.println("kkk");
    }

    public static void main(String[] args) {
        Test1 rr=new Test1();
        rr.one();
    }

}

  class NN{


}

