package Ex_15_OOPS_Concepts.Superkeyword;

public class Lab153 {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.t1();
    }
}


class Father {
    //we can also call the constructor of the parent class
    Father(){
        System.out.println("Default constructor father");
    }
    //we can also call the variables of the parent class
    int gold = 40;

    void home(){
        System.out.println("Home Father");
    }
 }

 class Son extends Father {
    Son(){
        super(); // we can call the constructor of the parent class
        System.out.println("Default constructor son");

    }
    void t1() {
        super.home();
        //super says that call the home method of the parent class
        System.out.println(super.gold); // we can call the variables of the parent class
    }
 }