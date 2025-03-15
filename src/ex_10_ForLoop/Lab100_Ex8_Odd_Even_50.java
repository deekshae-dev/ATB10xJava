package ex_10_ForLoop;

public class Lab100_Ex8_Odd_Even_50 {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if(i %2 == 0){
                System.out.println("even number - "+ i);
            } else{
                System.out.println("Odd number - "+ i);
            }
        }
    }
}
