package Ex_15_OOPS_Concepts.Abstraction;

public class Interface_DM_without_override {
    //this is an example of interface with default method without overriding
    public static void main(String[] args) {
        User u = new User();
        u.greet();
    }
}

interface Greetable1 {
    default void greet() {
        System.out.println("Hello from greetable");
    }
}

class User implements Greetable1 {
    //No overriding
}

