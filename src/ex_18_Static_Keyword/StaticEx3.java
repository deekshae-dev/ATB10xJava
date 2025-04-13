package ex_18_Static_Keyword;

public class StaticEx3 {
    public static void main(String[] args) {
        A obj1 = new A();


    }
}



class A{
    //this is a static block
    static {
        //here we can write some code which you want to execute when the class is loaded
        System.out.println("this is a static block and it is called only once when the class is loaded");
    }

    //this is a static variable
    static int a = 10;

    //this is a static method
    static void display(){
        System.out.println("this is a static method");
    }
}