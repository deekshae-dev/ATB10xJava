package Ex_14_Arrays;

public class Lab131_Ex7 {
    public static void main(String[] args) {
        // Sum of an array:

        int[] numbers = {12, 34, 10};
        int sum = 0;
        //for (int i = 0; i < numbers.length; i++) {
            //sum =  sum +numbers[i];
        //}
        //System.out.println(sum);

        System.out.println("------ ------- -------");
        for(int n: numbers) {
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
