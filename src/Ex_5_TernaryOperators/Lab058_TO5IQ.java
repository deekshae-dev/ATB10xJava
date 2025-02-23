package Ex_5_TernaryOperators;

public class Lab058_TO5IQ {

    public static void main(String[] args){
        int number = 15;
        String result = (number > 10)?(number > 20? "G > 20": "B 10 to 20") : "B";
        System.out.println(result);

    }
}
