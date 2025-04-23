package Ex_14_Arrays;

import java.util.Arrays;

public class Lab128_Ex4 {
    public static void main(String[] args) {
        int[] marks = {55,87,76,89,79};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println(" ----------");
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
        Arrays.sort(marks);
        //System.out.println(marks);

    }
}
