package Ex_8_IfCondition;

import java.util.Scanner;

public class Lab078_IC3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //scanner is a class
        System.out.println("enter a number");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
        sc.close();
    }
}
