package Ex_15_OOPS_Concepts.Poly.Methodoverriding;

public class Animal {
    void sound() {
        System.out.println("Animals make different types of sounds");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
