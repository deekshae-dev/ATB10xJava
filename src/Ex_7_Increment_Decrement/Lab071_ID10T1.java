package Ex_7_Increment_Decrement;

public class Lab071_ID10T1 {
    public static void main(String[] args){
        int a = 10;
        System.out.println(++a + a++ + a++);
        //++a means value of ++a is 11 and value of a is 11
        //so 11+
        //a++ means value of a++ is 11 and value of a is 12
        //so 11+11=21
        // a++ means value of a++ is 12  and value of a is 13
        //so 11+11+12=34

        System.out.println(a);


    }
}
