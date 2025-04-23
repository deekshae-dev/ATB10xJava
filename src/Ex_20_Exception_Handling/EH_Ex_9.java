package Ex_20_Exception_Handling;

public class EH_Ex_9 {
    public static void main(String[] args) {
        int a = 1;
        int c = 0;
        try {
            c = 10 / 0;
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will always be executed");
        }
        System.out.println(c);
    }
}
