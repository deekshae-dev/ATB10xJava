package Ex_17_Inheritance_OOPS;

public class MultilevelInh {
    public static void main(String[] args) {
        Son Ram = new Son();  //has grandfather's, father's and his(5)
        Father Kiran = new Father(); // has grandfather's, his(2)
        Grandfather Arjun = new Grandfather(); // his only(1)

        Ram.home(); // if we call this then it is coming from grandfather
        //Not possible cases:
        //Son s1 = new Grandfather();
        //Son s2 = new Father();

        //possible cases:
        Father f1 = new Son();
        Grandfather g1 = new Son();
        Grandfather  g2 = new Father();
    }
}
