package Ex_16_Constructors_OOPS;

public class Lab142_Ex1 {
    public static void main(String[] args) {
        Baby b1 = new Baby(); // the object is created only 1 time
        Baby b2; //object is not created as no reference is created
        new Baby(); //the object is created 3 times
        new Baby();
        //b1.name = "Neha";
    }
}
    class Baby{
        String name;

        Baby(){
            System.out.println("I am called, an object is created");
        }

    }
