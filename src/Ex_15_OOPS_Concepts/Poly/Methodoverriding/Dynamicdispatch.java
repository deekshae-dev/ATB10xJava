package Ex_15_OOPS_Concepts.Poly.Methodoverriding;

class Animals {
    void sound() {
        System.out.println("Animals make different types of sounds");
    }
}

class Cat extends Animals {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class Sheep extends Animals {
    @Override
    void sound() {
        System.out.println("Sheep bleats");
    }
}

public class Dynamicdispatch {
    public static void main(String[] args) {
        Animals a;

        a = new Cat();
        a.sound();

        a = new Sheep();
        a.sound();
    }
}
