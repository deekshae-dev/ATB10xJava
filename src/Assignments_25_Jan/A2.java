package Assignments_25_Jan;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        int vowels = 0, cons = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter the string");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    cons++;
                }
            }
        }
        System.out.println("The no of vowels are:" + vowels);
        System.out.println("The no of consonants are:" + cons);

        scanner.close();
    }
}
