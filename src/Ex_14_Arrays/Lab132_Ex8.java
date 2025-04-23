package Ex_14_Arrays;

import java.util.Scanner;

public class Lab132_Ex8 {
    public static void main(String[] args) {
        // Taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("enter the no");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("------ ------- -------");

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
