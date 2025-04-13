package Ex_15_OOPS_Concepts.Superkeyword;

public class Animal1 {
    //with variable
    String type =  "Animal";
}

class Dog1 extends Animal1 {
    String type = "Dog";

    public static void main(String[] args) {
    Dog1 d = new Dog1();
    d.printType();
}
    void printType() {
        System.out.println(type);
        System.out.println(super.type);
    }
}
