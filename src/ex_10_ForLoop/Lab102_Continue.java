package ex_10_ForLoop;

public class Lab102_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if (i == 5) {
              continue; //skips the below code and move to top
            }
            System.out.println(i);
        }
    }

}
