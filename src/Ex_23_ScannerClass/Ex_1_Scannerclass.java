package Ex_23_ScannerClass;

import java.util.Scanner;
public class Ex_1_Scannerclass {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter ur name:");
        String name = s1.nextLine();

        System.out.println("enter word");
        String word = s1.next();

        System.out.println("enter hobbies");
        s1.nextLine();
        String hobbies = s1.nextLine();

        System.out.println("enter ur age:");
        int age = s1.nextInt();

        System.out.println("enter ur salary:");
        double sal = s1.nextDouble();

        System.out.println("Name:" +name);
        System.out.println("Age:" +age);
        System.out.println("Salary:" +sal);
        System.out.println("Word:" +word);
        System.out.println("Hobbies:" +hobbies);

        s1.close();
    }
}
