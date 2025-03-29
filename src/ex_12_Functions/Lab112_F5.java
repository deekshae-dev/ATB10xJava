package ex_12_Functions;

import java.util.Scanner;

import static ex_12_Functions.Lab113_F6.sum;

public class Lab112_F5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num 1");
        int a = 0;
        if(sc.hasNextInt()){
            a = sc.nextInt();
        }
        else {
            System.out.println("enter only int");
            System.exit(0);
        }
        System.out.println("enter num 2");
        int b = 0;
        if (sc.hasNextInt()) {
            b = sc.nextInt();
        }
        else {
            System.out.println("enter only int");
            System.exit(0);
        }
        int result = sum(a,b);
        System.out.println(result);
    }

    public static int sum(int i1, int i2){
        return i1 + i2;
    }
}
