package ex_3_Operators;

public class Lab030_OpEx4 {
    public static void main(String[] args){
//unary operator
        int a = 10;
        int b = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        System.out.println(b++ + b++);
        System.out.println(b);
    }
}
