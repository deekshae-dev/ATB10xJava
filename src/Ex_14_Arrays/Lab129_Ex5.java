package Ex_14_Arrays;

public class Lab129_Ex5 {
    public static void main(String[] args) {

        int[] array = {12, 14, 26, 55, 67, 76, 11, 2, 48};
        int max_output = give_max(array);
        System.out.println(max_output);
        int min_output = give_min(array);
        System.out.println(min_output);
    }

    static int give_max(int[] array) {
        int max = array[0]; //12
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
    return max;
    }

    static int give_min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}

