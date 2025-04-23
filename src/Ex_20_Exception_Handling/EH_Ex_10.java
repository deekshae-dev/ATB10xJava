package Ex_20_Exception_Handling;

import java.util.Scanner;

public class EH_Ex_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        int a = sc.nextInt();
        try{
            int b = 10/0;
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            System.out.println("closing sc");
        }
    }
}
