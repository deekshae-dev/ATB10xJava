package ex_12_Functions;

import java.util.Scanner;

public class Lab110_F3 {
    public static void main(String[] args) {
        //user defined functions

        //without parameters and without return type
        //without parameters and with return type
        //with parameters and without return type
        //with parameters and with return type

        //1)without parameters and without return type
//        greet();

        //2)without parameters and with return type
//        String s = greet_with_hello();
//        System.out.println(s);
//        int age_to_vote_person = age_to_vote();
//        System.out.println("Age to vote is->" +age_to_vote_person);
//        greet_with_hello();

        //3)with parameters and without return type
//        greet_with_name("Deeksha");
//        greet_with_name("Bobby Deol");
//        greet_with_name("Vaishnavi");
//        greet_with_fullname("Deeksha","E");
//        greet_with_fullname("Vaishnavi","Siddatapu");

//        //if we want to take input from the user
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter ur name:");
//        String name = sc.next();
//        System.out.println("enter ur age:");
//        int age = sc.nextInt();
//        System.out.println("enter ur salary:");
//        double salary = sc.nextDouble();
//        greet_with_details("Roja",23,2300);
//        greet_with_details("Deeksha",25,50000);
//        greet_with_details("Vaishnavi",25,56000);

        //4)with parameters and with return type
       int multiply = multiply_of_2_numbers(12,4);
       int m1 = multiply_of_2_numbers(11,7);
       int m2 = multiply_of_2_numbers(13,8);
       System.out.println(multiply);
       System.out.println(m1);
       System.out.println(m2);

    }
    //1)without parameters and without return type
    static void greet(){
        System.out.println("Namaste,this is a function without parameters and without return type");
    }

    //2)without parameters and with return type
    static String greet_with_hello(){
        return "Hi,this is a funtion with parameters and without return type";
    }

    static int age_to_vote(){
        System.out.println("Calculating age...");
        return 18;
    }

    //3)with parameters and without return type(void)
    static void greet_with_name(String name){
        System.out.println("Hi, My name is : " +name);
    }
    static void greet_with_fullname(String firstname,String lastname){
        System.out.println("Hi, My name is : " +firstname +lastname);
    }
    static void greet_with_details(String name, int age, double salary){
        System.out.println("My name is:" +name + "\nmy age is:" +age + "\nmy salary is:" +salary);
    }

    //4)with parameters and with return type
    static int multiply_of_2_numbers(int a, int b){
        return a * b;
    }
}
