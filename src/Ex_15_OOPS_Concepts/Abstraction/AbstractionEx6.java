package Ex_15_OOPS_Concepts.Abstraction;

public class AbstractionEx6 {
    public static void main(String[] args) {
        Children c1 = new Children();
        c1.greet();
    }
}

//example with default method (methods with body)
class Children implements A,B {
    @Override
    public void greet() {
        System.out.println("Hello from C");
    }
}

interface A{
    default void greet(){
        System.out.println("Hello from A");
    }
}

interface B{
    default void greet(){
        System.out.println("Hello from B");
    }
}