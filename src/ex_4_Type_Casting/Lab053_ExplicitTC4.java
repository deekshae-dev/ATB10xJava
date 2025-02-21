package ex_4_Type_Casting;

public class Lab053_ExplicitTC4 {
    public static void main(String[] args){
        int course = 100;
        float GST = 18.45f;
    //    int total_int = course+(int)GST; //narrow-explicit is not possible
        float total = course+GST; //widening - implicit
       // float total = (float) course + GST; //widening -explicit
        System.out.println(total);
      //  System.out.println(total_int);
    }
}
