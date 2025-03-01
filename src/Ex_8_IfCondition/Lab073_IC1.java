package Ex_8_IfCondition;

public class Lab073_IC1 {
    public static void main(String [] args){
        //int age = 19;
        // getting value from command-line arguments
        int age = Integer.parseInt(args[0]);

        if(age>18){
            System.out.println("You are allowed to vote");
        }


    }
}
