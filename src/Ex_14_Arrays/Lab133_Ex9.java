package Ex_14_Arrays;

public class Lab133_Ex9 {
    public static void main(String[] args) {
       //For each loop :
        int[] a = new int[3];
        a[0] = 81;
        a[1] = 82;
        a[2] = 83;

        for (int i : a) {
            System.out.println(i);

        }

        String[] names = {"A","B","C"};
        for (String name : names) {
            System.out.println(name);
        }

        for(String n : names) {
            System.out.println(n);
        }
    }
}
