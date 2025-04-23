package Ex_20_Exception_Handling;

public class EH_Ex_6 {
    public static void main(String[] args) {
        // it is an unchecked exception
        System.out.println("Start");
        String s1 = null;
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}

