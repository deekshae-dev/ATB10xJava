package Ex_22_Collections_Framework;

import java.util.LinkedList;
import java.util.List;
public class Ex_4_LinkedList {
    public static void main(String[] args) {
        List mylist2 = new LinkedList();
        mylist2.add("Neha");
        mylist2.add("Sharma");
        mylist2.add(123456);
        mylist2.add(456789);
        mylist2.add('d');
        mylist2.addFirst("Ram");
        mylist2.addLast("Kalyan");

        System.out.println(mylist2.isEmpty());
        System.out.println(mylist2);
        System.out.println("***");
        System.out.println(mylist2.size());
        System.out.println(mylist2);
        System.out.println("***");
        System.out.println(mylist2.contains("Neha"));
        System.out.println(mylist2);
        System.out.println("***");
        System.out.println(mylist2.getFirst());
        System.out.println(mylist2);
        System.out.println("***");
        System.out.println(mylist2.getLast());
        System.out.println(mylist2);
        System.out.println("***");
        System.out.println(mylist2.removeFirst());
        System.out.println(mylist2);
        System.out.println("***");
        System.out.println(mylist2.removeLast());
        System.out.println(mylist2);
        System.out.println("***");
        System.out.println(mylist2.indexOf(123456));
        System.out.println(mylist2);
        System.out.println("***");



    }
}
