package Ex_20_Exception_Handling;

public class EH_Ex_8 {
    public static void main(String[] args) {
    int a = 0;
    int b = 0;
    try{
        b = 10/a;
        String s1 = null;
        s1.trim();
    } catch (ArithmeticException |NullPointerException e) {
        System.out.println(e.getMessage());
    }
//    catch (NullPointerException e) {
//        System.out.println(e.getMessage());
//    }
        System.out.println("c");
   }
}

