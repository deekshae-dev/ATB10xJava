package Ex_15_OOPS_Concepts.Abstraction;

public class AbstractionEx7 {
    public static void main(String[] args) {

        // we can also ude dynamic dispatch with interfaces
        //Deeksha e1 = new E();
        E e1 = new E();
        e1.display();
        System.out.println(e1.a);
    }
}

//how exactly we can use the variable a:

class E implements Deeksha {
    @Override
    public void display() {
        System.out.println(a);
    }
}

interface Deeksha{
    int a = 25;
    void display();
}
