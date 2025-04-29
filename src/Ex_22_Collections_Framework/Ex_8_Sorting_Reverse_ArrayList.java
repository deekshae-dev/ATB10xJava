package Ex_22_Collections_Framework;

import java.util.*;
import java.util.List;
import java.util.Collections;

public class Ex_8_Sorting_Reverse_ArrayList {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(78);
        marks.add(81);
        marks.add(88);
        marks.add(68);
        marks.add(91);
        marks.add(77);
        System.out.println("Before sorting the marks");
        System.out.println(marks);
        System.out.println("***");
        Collections.sort(marks);
        System.out.println("After sorting the marks");
        System.out.println(marks);
        System.out.println("***");
        System.out.println("Before reversing the marks");
        System.out.println(marks);
        System.out.println("***");
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println("After reversing the marks");
        System.out.println(marks);
        System.out.println("***");

    }
}
