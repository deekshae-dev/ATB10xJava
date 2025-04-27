package Ex_15_OOPS_Concepts.Abstraction;

public class Multiple_Interfaces_With_DM {
    public static void main(String[] args) {
        C obj1 = new C();
        obj1.show();
    }
}

interface Apple {
    default void show() {
        System.out.println("Show from Apple");
    }
}

interface Ball {
    default void show() {
        System.out.println("Show from Ball");
    }
}

class C implements Apple,Ball {
    @Override
    // If 2 interfaces have the same default method, then we
    //must override it in the implementing class to resolve the conflict
    public void show() {
        System.out.println("Resolved the issue:)");
    }
}