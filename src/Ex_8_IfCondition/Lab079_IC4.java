package Ex_8_IfCondition;

import java.util.Scanner;

public class Lab079_IC4 {
    public static void main(String [] args){
        //num1 and num2
        //num1 > num2  ---1
        //num1 < num2  ---2
        //num1 == num2 ---3


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first no");
        int num1 = sc.nextInt();
        System.out.println("enter the second no");
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("num1");
        }
        else if(num2>num1){
            System.out.println("num2");
        }
        else{
            System.out.println("equal");
        }
    }
}
