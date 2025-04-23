package Ex_20_Exception_Handling;

public class EH_Ex_1 {
    public static void main(String[] args) {

        System.out.println("Start the program");
        String ip = args[0]; //
        int a = Integer.parseInt(ip); // convert string to integer
        int b = 100 / a;
        System.out.println(b);
        System.out.println("End the program");
    }
    // we can have 3 exceptions here
    //java.lang.ArithmeticException: /by zero when args->0
    //java.lang.NumberFormatException: for input string:deeksha
    //java.lang.ArrayIndexOutOfBoundsException:Index 0 out of bounds

}
