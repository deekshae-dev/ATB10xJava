package Ex_9_SwitchCondition;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("name:");
        String name = scanner.nextLine();

        System.out.println("age: ");
        int age = scanner.nextInt();

        System.out.println("salary: ");
        double salary = scanner.nextDouble();

        scanner.close();
    }
}
