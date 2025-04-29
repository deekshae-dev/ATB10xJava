package Ex_22_Collections_Framework;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_9_Arraylist_Input {
    public static void main(String[] args) {
        //multiple inputs from the user and store them in seperdate
        //arraylists based on user-defined categories

        Scanner scanner = new Scanner(System.in);
        ArrayList <String> names = new ArrayList<>();
        ArrayList <Integer> ages = new ArrayList<>();

        String continueInput = "Y"; //control variable for input loop
        while (continueInput.equalsIgnoreCase("Y")) {
            System.out.println("Enter ur name:");
            String name  = scanner.nextLine();
            names.add(name);

            System.out.println("Enter ur age:");
            int age= scanner.nextInt();
            ages.add(age);//adding age to ages list

            scanner.nextLine();
            System.out.println("do u want to enter one more record ? (Y/N)");
            continueInput = scanner.nextLine();

        }

//        for (Object o1 : names) {
//            System.out.println(o1);
//        }
          for(String name : names) {
              System.out.println(name);
          }

//        for (Object o2 :ages) {
//            System.out.println(o2);
//        }
          for(Integer age : ages) {
              System.out.println(age);
          }



        scanner.close();
    }
}
