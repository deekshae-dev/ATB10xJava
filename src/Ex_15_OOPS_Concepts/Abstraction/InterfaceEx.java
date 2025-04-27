package Ex_15_OOPS_Concepts.Abstraction;

public class InterfaceEx {
    public static void main(String[] args) {
        Animals d1 = new Dog1();
        d1.makeSound();
        d1.eating();
        Animals c1 = new Cat1();
        c1.makeSound();
        c1.eating();
    }
}

interface Animals {
    void makeSound();
    default void eating() {
        System.out.println("Animal is eating");
    }
}

class Dog1 implements Animals {
    public void makeSound() {
        System.out.println("Dog barks");
        //dog did not override eating() it used the default
    }
}

class Cat1 implements Animals {
    public void makeSound() {
        System.out.println("Cat meows");
    }
        @Override
        public void eating() {
            System.out.println("Cat is eating");
            //cat did override eating() used its own
        }
    }