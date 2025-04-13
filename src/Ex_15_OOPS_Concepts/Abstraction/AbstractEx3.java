package Ex_15_OOPS_Concepts.Abstraction;

public class AbstractEx3 {
    public static void main(String[] args) {
        Dog d = new Dog("Buddy");
        Cat c = new Cat("Whiskers");

        d.perform();
        c.perform();
    }
}

//this is the abstract class used to hide the implementation details
abstract class Animal {
    private String name;

    //constructor of the abstract class
    public Animal(String name) {
        //this keyword refers the current class variable
        this.name = name;
    }

    //abstract method to be overridden
    public abstract void makeSound();

    public String getName() {
        return name;
    }
}

class Dog extends Animal {

    //Constructor of Dog
    public Dog(String name) {
        //super keyword is used to call the parent constructor
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " says Woof!");
    }

    void perform() {
        makeSound();
    }
}

//Child class of Animal
class Cat extends Animal {

    //Constructor of Cat
    public Cat(String name) {
        //super keyword is used to call the parent constructor
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Meow!");
    }

    void perform() {
        makeSound();
    }
}
