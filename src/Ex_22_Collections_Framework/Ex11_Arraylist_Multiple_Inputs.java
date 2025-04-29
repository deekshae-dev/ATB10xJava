package Ex_22_Collections_Framework;

import java.util.*;
import java.util.Scanner;

public class Ex11_Arraylist_Multiple_Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<String> vegetables = new ArrayList<>();

        System.out.print("Enter number of items you want to add: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter category (Fruit/Vegetable): ");
            String category = sc.nextLine().trim();

            System.out.print("Enter item name: ");
            String item = sc.nextLine().trim();

            if (category.equalsIgnoreCase("Fruit")) {
                fruits.add(item);
            } else if (category.equalsIgnoreCase("Vegetable")) {
                vegetables.add(item);
            } else {
                System.out.println("Invalid category! Skipping...");
            }
        }

        System.out.println("\nFruits List: " + fruits);
        System.out.println("Vegetables List: " + vegetables);
    }
}


