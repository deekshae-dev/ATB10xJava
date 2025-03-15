package ex_10_ForLoop;

public class Lab101_Break {
    public static void main(String[] args) {
        for(int i = 0; i< 50; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
