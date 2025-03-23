package Assignments_25_Jan;

import java.util.Scanner;

public class A3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter a string ");
        String str = scanner.nextLine();

        int length = str.length();

        for (int i = 0; i < length/2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                System.out.println("Not a palindrome");
                scanner.close();
                return;
            }
        }
        System.out.println(" It is a palindrome");
        scanner.close();
    }
}
