package Ex_20_Exception_Handling;

public class EH_Ex_7 {
    public static void main(String[] args) {
        int c = 0;
        int b = 0;
        try {
            b = 10 / c;
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        //catch (Exception e) {
         //   System.out.println(e.getMessage());
       // }
     //   catch (Throwable e){
       //     System.out.println(e.getMessage());
      //  }
        System.out.println(b);
    }
}

