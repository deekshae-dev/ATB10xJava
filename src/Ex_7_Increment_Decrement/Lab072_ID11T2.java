package Ex_7_Increment_Decrement;

public class Lab072_ID11T2 {
    public static void main(String [] args){
        int a = 20;
        System.out.println(--a + a++ + a--);
        //--a means value of --a is 19 and also a is 19
        // so 19+
        //a++ means value of a++ is 19 and a is 20
        // so 19+19
        //a-- means value of a-- is 20 and a is 19
        // so 19+19+20=58
        System.out.println(a);
    }
}
