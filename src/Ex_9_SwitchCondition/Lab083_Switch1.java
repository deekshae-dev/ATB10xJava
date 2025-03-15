package Ex_9_SwitchCondition;

import java.util.Scanner;

public class Lab083_Switch1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the browser");
        String browser = scanner.next();
        switch (browser){
            case "chrome" :
                System.out.println("starting the chrome browser");
                System.out.println("..........");
                System.out.println("TC");
                break;
            case "firefox" :
                System.out.println("starting the firefox browser");
                System.out.println("...........");
                System.out.println("TC");
                break;
            case "edge" :
                System.out.println("execute the edge case");
                break;
            default:
                System.out.println("i dont have any idea about the browser type");

        }

    }
}
