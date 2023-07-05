package Modifiers;

 public class Test1 {

    public void one(){
        System.out.println("First Public Method");

    }
}

 class B{

     public void two(){
         System.out.println("Second Public Method");

    }

     public static void main(String[] args) {
         Test1 ref=new Test1();
         ref.one();

     }

}