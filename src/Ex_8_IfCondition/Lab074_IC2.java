package Ex_8_IfCondition;

import java.util.Scanner;

public class Lab074_IC2 {
    public static void main(String [] args){

        //int age = 28;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age please");
        int age = sc.nextInt();

        if(age>18){
            System.out.println("Can vote");
        }
        else{
            System.out.println("Cannot vote");
        }
    }
}
