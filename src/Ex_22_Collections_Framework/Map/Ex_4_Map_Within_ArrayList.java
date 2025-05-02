package Ex_22_Collections_Framework.Map;

import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Ex_4_Map_Within_ArrayList {
    public static void main(String[] args) {
        HashMap<String,String> student1 = new HashMap<>();
        student1.put("name","Riva");
        student1.put("rollno","1");
        student1.put("phone","12345");
        System.out.println(student1);

        HashMap<String,String> student2 = new HashMap<>();
        student2.put("name","Manu");
        student2.put("rollno","2");
        student2.put("phone","45678");
        System.out.println(student2);

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);
    }
}
