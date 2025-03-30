package Ex_13_Strings;

import java.util.Arrays;

public class Lab132_Ex8 {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1,100,3,4,32};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length - 2]);
    }
}


