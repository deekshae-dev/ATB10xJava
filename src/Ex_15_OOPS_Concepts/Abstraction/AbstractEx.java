package Ex_15_OOPS_Concepts.Abstraction;

public class AbstractEx {
    public static void main(String[] args) {
      Child c = new Child();
      c.loan50k();
      c.loan25k();

      //Father f1 = new Father();
      //we cannot create a father object
        //abstract classes don't have any object
      //child has successfully hidden the details of the parent
      //here the loan of father is not visible we are hiding it
    }
}


//abstract class -//Hiding these details
abstract class Father {
    abstract void loan50k();
        void loan25k() {
            System.out.println("Given amount of 20k");
        }
    }

    class Child extends Father {
    @Override
        void loan50k() {
            System.out.println("Child will pay the loan of 50k");
        }
    }