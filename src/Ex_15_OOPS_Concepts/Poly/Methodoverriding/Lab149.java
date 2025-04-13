package Ex_15_OOPS_Concepts.Poly.Methodoverriding;

public class Lab149 {
    public static void main(String[] args) {
        Ram r1 = new Ram();
        r1.home();

        Father f1 = new Father();
        f1.home();

        Father f2 = new Ram();
        //dynamic dispatch
        // the call will be done based on the object as the child has it
        //if not parent is called
        f2.home(); //method overriding - ridden the father(parent class) method using the
        //keyword @override
        //dynamic dispatch says that we can have a son reference with the
        //father reference
     //dynamic dispatch says that we can have child object with
     //the parent reference but vice - versa is not possible
    }
}
