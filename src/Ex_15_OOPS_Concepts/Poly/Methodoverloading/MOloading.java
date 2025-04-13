package Ex_15_OOPS_Concepts.Poly.Methodoverloading;

public class MOloading {

    public static void main(String[] args) {
        Mathoperations m1 = new Mathoperations();

        int r1 = m1.add(10,20);
        System.out.println(r1);

        int r2 = m1.add(12, 14, 16);
        System.out.println(r2);

        double r3 = m1.add(10.5,12.5);
        System.out.println(r3);
    }
}
