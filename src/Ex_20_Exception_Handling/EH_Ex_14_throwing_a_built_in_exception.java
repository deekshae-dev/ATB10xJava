package Ex_20_Exception_Handling;

public class EH_Ex_14_throwing_a_built_in_exception {
    public static void main(String[] args) {

        int age = 18;

        if(age < 18) {
            throw new ArithmeticException("You must be 18 or older to vote");
        }

        System.out.println("Yes!! you can vote:)");
    }
}
