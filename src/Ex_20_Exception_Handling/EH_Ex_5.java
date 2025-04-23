package Ex_20_Exception_Handling;

public class EH_Ex_5 {
    public static void main(String[] args) {
        try {
            // we have an option of try this code if there is any
            //problem then catch it
            int a = 10 / 2;
            //if there is no problem in try block
            //try will be executed and catch won't get executed
            System.out.println(a);
            System.out.println("1");
            int a1 = 10 / 0; // this will throw an exception and won't work so
            //it goes to catch block and prints the message
            System.out.println(a1);

        } catch(Exception e) {
            // we try the code present in try if it does not execute
            //then we execute e.getMessage or the custom message
            // we can either do getMessage() or print our own custom message
            //System.out.println(e.getMessage());
            e.printStackTrace(); // full problem details with line number is printed
            System.out.println("are you fool, / by zero is not possible");
        }
        System.out.println("2");
    }
}
