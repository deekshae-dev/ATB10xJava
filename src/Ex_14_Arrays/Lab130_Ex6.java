package Ex_14_Arrays;

public class Lab130_Ex6 {
    public static void main(String[] args) {
        // Reverse of an array:

        int[] numbers = {1,2,3,4,5};
        for(int i = numbers.length - 1; i >= 0; i--){  //index based
            System.out.println(numbers[i]);
        }
    }
}
