package ex_2_JavaBasic;

public class lab022_MultipleVarEx {
    public static void main(String[] args){

        int a = 23, b = 12, c=33, d;
        //this is a valid declaration
        d = a+b+c;
        System.out.println(d);
        int e = 34; //,d = 11;
        //This is an invalid declaration\
        System.out.println(e);
    }
}
