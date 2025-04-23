package Ex_15_OOPS_Concepts;

public class Lab140_Ex3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        //student- class loading
        //s1 - object reference
        //s3 new Student() - object creation
        s1.name = "Raj";
        s1.roll = 101;
        s1.sleep();
        System.out.println(s1.name);
        System.out.println(s1.roll);
        Student s2 = new Student();
        s2.name = "Rahul";
        s2.roll = 102;
        s2.sleep();
        System.out.println(s2.name);
        System.out.println(s2.roll);
    }
}

class Student {
    String name;
    int roll;
    void sleep(){
    }
}
