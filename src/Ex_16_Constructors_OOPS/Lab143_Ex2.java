package Ex_16_Constructors_OOPS;

public class Lab143_Ex2 {
    //default constructor
public static void main(String[] args){
    A a1 = new A();
    A a2 = new A();
    System.out.println(a1);
    System.out.println(a2);
}
}

    class A{
        A(){
            System.out.println("this is a default constructor");
        }
    }

