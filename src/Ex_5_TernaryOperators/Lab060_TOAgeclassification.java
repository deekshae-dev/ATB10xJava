package Ex_5_TernaryOperators;

public class Lab060_TOAgeclassification {
    public static void main(String[] args){
//        int age = 75;

        String age_string = args[0];
        int age = Integer.parseInt(age_string); //we are giving this value from edit configuration
        System.out.println(age); //CLI method of giving input

        //adult,minor,senior
        //senior > 65
        //minor < 18
        //adult > 18
        String result = (age < 18) ? "Minor" : (age<65) ?"Adult" : "Senior";
        System.out.println(result);


    }
}
