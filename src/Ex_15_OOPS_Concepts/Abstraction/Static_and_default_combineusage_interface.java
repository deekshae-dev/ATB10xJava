package Ex_15_OOPS_Concepts.Abstraction;

public class Static_and_default_combineusage_interface {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        d.makeSound();
        d.sleep();

        //static method is called using interface name directly
        Animal2.printInfo();
    }
}

interface Animal2 {
    //default method(it can be overridden or used directly)
    default void sleep() {
        System.out.println("Animal is sleeping");
    }

    //static methods(they belong to interface)
    // and are called using the interface name
    static void printInfo() {
        System.out.println("Animals are living beings");
    }

    //abstract method(This must be overridden)
    void makeSound();
}

class Dog2 implements Animal2 {
    //Overriding abstract method
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }

    //we can also override the default method it is optional
    @Override
    public void sleep() {
        System.out.println("The dog is sleeping peacefully");
    }
}
