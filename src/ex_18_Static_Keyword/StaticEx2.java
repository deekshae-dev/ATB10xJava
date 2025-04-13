package ex_18_Static_Keyword;

public class StaticEx2 {
    public static void main(String[] args) {
        ATB Umeshwari = new ATB(987654321, "Umeshwari");
        ATB Ramesh = new ATB(987654322, "Ramesh");
        System.out.println(Umeshwari.phone_no);
        System.out.println(Umeshwari.name);
        System.out.println(Ramesh.phone_no);
        System.out.println(Ramesh.name);
        //accessing static variable
        System.out.println(ATB.course_name);
        //accessing static method
        ATB.attendance();
    }
}


class ATB{
    //this is a static variable
    static String course_name = "ATB";
    int phone_no;
    String name;

    public ATB(int phone_no_c, String name_c){
        this.phone_no = phone_no_c;
        this.name = name_c;
    }

    void display(){
        System.out.println("Name:" + name + ",Phone:" + phone_no + ",Course:" + course_name);
    }

    //this is a static method
    static void attendance() {
        System.out.println("mark the attendance");
    }
}