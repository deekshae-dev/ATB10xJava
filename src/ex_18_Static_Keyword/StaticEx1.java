package ex_18_Static_Keyword;

public class StaticEx1 {
    public static void main(String[] args) {
        Student s1 = new Student(18);
        Student s2 = new Student(19);

        System.out.println(s1.age);
        System.out.println(s2.age);
        System.out.println(Student.course_name);

    }
}



//static means common to all
class Student {
   int age;
   static String course_name = "ATB";

   public Student(int age_c){
       this.age = age_c;
   }
}