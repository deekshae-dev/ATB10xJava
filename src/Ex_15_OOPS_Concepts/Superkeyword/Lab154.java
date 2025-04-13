package Ex_15_OOPS_Concepts.Superkeyword;

public class Lab154 {
    public static void main(String[] args) {
    Car c1 = new Car(100);
    c1.display();
    }
}

class Vehicle {
    public int maxSpeed = 180;

    void noTest(){

    }

    Vehicle() {
        System.out.println("Default constructor");
    }

    Vehicle(int a) {
        System.out.println("Parametrized constructor");
    }


    void message() {
        System.out.println("No return type, No argument");
    }

    void message(int a) {
        System.out.println("Parametrized constructor with arguments");
    }
        void display() {
            System.out.println("Vehicle parent");
        }

    }

class Car extends Vehicle {
    private int maxSpeed = 281;

    Car() {
        super(128);
    }

    void test() {

    }
    Car(int a){
        System.out.println("Parametrized constructor of car");
    }

    @Override
    void display() {
        System.out.println("Override -Car");
        System.out.println(super.maxSpeed);
        System.out.println(this.maxSpeed);
        super.noTest();
        this.test();
    }
}