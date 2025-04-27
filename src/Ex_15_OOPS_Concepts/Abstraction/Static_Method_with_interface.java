package Ex_15_OOPS_Concepts.Abstraction;

public class Static_Method_with_interface {
    public static void main(String[] args) {
        // we are calling the static method using the interface name
        Flowers.printInfor();
    }
}

interface Flowers {
    static void printInfor() {
        System.out.println("This is a flower");
    }
}