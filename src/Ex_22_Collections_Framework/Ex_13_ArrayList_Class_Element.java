package Ex_22_Collections_Framework;

import java.util.ArrayList;
import java.util.List;

public class Ex_13_ArrayList_Class_Element {
    public static void main(String[] args) {
        Student s1 = new Student("Kanika","1");
        Student s2 = new Student("Ram","2");
        Student s3 = new Student("Lakshman","3");

        List <Student> myStudents = new ArrayList<>();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        //here if we print these then only references will be printed

        for (Student s : myStudents) {
            s.printDetails();
        }
        //System.out.println(myStudents);

//        s1.printDetails();
//        s2.printDetails();
//        s3.printDetails();


    }
}
