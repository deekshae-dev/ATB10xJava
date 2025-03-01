package Ex_8_IfCondition;

import java.util.Scanner;

public class Lab081_IC6HR {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("side 1 length");
        double side1 = sc.nextDouble();

        System.out.println("side 2 length");
        double side2 = sc.nextDouble();

        System.out.println("side 3 length");
        double side3 = sc.nextDouble();

        if (side1 < 0 || side2 < 0 || side3 < 0) {
            System.out.println("not a valid input:length should be positive only");
        } else {
            if (side1 == side2 && side2 == side3 && side1 == side3) {
                System.out.println("equilateral triangle");
            } else if (side1 == side2 || side2 == side3 || side3 == side1) {
                System.out.println("isosceles triangle");
            } else {
                System.out.println("scalene triangle");
            }
        }
    }
}