package Ex_20_Exception_Handling;

public class EH_Ex_11_IQ_1 {
    public static void main(String[] args) {
        final double PI = 3.14;
        int a = 0;
        try {
            int x = 10 / a;
        } catch(Exception e){
            System.out.println("div by zero");
        } finally {
            System.out.println("will be executed");
        }
    }
}
