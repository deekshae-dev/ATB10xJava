package Ex_15_OOPS_Concepts.Abstraction;

import java.security.PublicKey;

public class Interface_DM_with_override {
    //this is an example of interface with default method with overriding
    public static void main(String[] args) {
        Admin a = new Admin();
        a.greet();
    }

}

interface Greetable2 {
    default void greet() {
        System.out.println("Hello from interface");
    }
}

class Admin implements Greetable2 {
    @Override
    public void greet() {
        System.out.println("Hello from Admin");
        //here Admin gave its own version of greet()
    }
}
