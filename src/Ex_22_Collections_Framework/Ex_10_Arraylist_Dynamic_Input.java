package Ex_22_Collections_Framework;

import java.util.*;

public class Ex_10_Arraylist_Dynamic_Input {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         ArrayList<Integer> list = new ArrayList<>();

        System.out.println("enter the no of elements : ");
        int n = sc.nextInt();

        System.out.println("enter " +n+ " elements : ");

        for(int i = 0; i < n; i++) {
            int e = sc.nextInt();
            list.add(e);
        }
        System.out.println("Arraylist : " +list);
        sc.close();
    }
}
