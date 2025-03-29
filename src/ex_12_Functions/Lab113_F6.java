package ex_12_Functions;

import java.math.BigInteger;
import java.util.Scanner;

public class  Lab113_F6{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num1 ");
        int a = 0;
        if(scanner.hasNextInt()){
            a = scanner.nextInt();
        }
        else{
            System.out.println("Enter the int only");
            System.exit(0);
        }
        // BigInteger a = scanner.nextBigInteger();
        System.out.println("Enter the num2 ");
        int b = scanner.nextInt();

        int result_sum = sum(a,b);
        int result_sub = sub(a,b);
        int result_mul = mul(a,b);
        int result_div = div(a,b);
        int result_mod = modulus(a,b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_mod);


    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int modulus(int a, int b) {
        return a % b;
    }

    static int div(int a, int b) {
        if (b == 0) {
            System.out.println("Div by Zero not allowed!");
        }
        return a / b;
    }


}
