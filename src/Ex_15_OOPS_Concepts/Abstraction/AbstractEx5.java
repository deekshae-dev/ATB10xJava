package Ex_15_OOPS_Concepts.Abstraction;

public class AbstractEx5 {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.money();
    }
}

//implementing multiple inheritance using interface
class Child1 implements Mother1, Father1 {
    @Override
    public void f1() {
        System.out.println("Only 1 money");
    }

    @Override
    public void money() {
        //though we have money() in both the interfaces
        //they are incomplete ,and we will have only 1 money() function
        //so there won't be any type of confusion as duplicacy is not allowed

    }

    @Override
    public void m1() {
    }
}

interface Mother1{
    void money();
    void m1();
}

interface Father1{
    void money();
    void f1();
}
