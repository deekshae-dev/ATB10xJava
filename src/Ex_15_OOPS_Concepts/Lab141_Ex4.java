package Ex_15_OOPS_Concepts;

public class Lab141_Ex4 {
    public static void main(String[] args) {

        Cat c1 = new Cat(); // one object
        Cat c2 = null; //one reference
        new Cat(); //an object without reference

        c1.running();
       // c2.running(); // c2 does not have any object so how can we access it
        // when we try to access running without object then it will throw an error a null pointer exception
        //java.lang.NullPointerException it will throw
    }
}





    class Cat{
        String name;

        void running(){
            System.out.println("Running");
        }
    }
