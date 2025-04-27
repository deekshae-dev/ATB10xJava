package Ex_15_OOPS_Concepts.Abstraction;

public class Private_Example_interface1 implements GreetingService{
    public static void main(String[] args) {
        GreetingService demo =  new Private_Example_interface1();
        demo.sayHello(); //here we are calling default method
        GreetingService.sayHi();
    }
}

interface GreetingService {
    //default method
    default void sayHello() {
        greet();
        System.out.println("Hello from default method");
    }

    //static method
    static void sayHi() {
        log();
        System.out.println("Hi from static method");
    }

    //Private instance method
    private void greet() {
        System.out.println("Greeting (Common logic in private method)");
    }

    private static void log() {
        System.out.println("Logging (Common logic in private static method)");
    }
}

