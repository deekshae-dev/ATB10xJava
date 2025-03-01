package Ex_8_IfCondition;

import java.util.Scanner;

public class Lab080_IC5_HR {
    public static void main(String [] args){
        //a,b,c,d,f
        //a:90-100
        //b:80-89
        //c:70-79
        //60-59
        //0-59
        Scanner sc = new Scanner(System.in);
        System.out.println(" score pls");
        int score = sc.nextInt();
        char grade = 'F';

        if(score>=90 && score<=100){
            grade = 'A';
        } else if(score >= 80 && score<89){
            grade = 'B';
        } else if (score >=70 && score<79) {
            grade = 'C';
        } else if (score>=60 && score<69) {
            grade = 'D';
        } else if (score <= 0 || score >100) {
            grade = 'O';
        } else {
            grade = 'F';
        }
        System.out.println("your grade is:" +grade);
    }
}
