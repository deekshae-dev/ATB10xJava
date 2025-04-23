package Ex_20_Exception_Handling;

public class Ex17_Finally_Not_Handled_Properly {
    public static void main(String[] args) {

        try {
            int a = 10/0;
            System.out.println(a);
            //System.exit will terminate the program itself before going to catch
            System.exit(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Hello Last");
        }
    }
}
