package Ex_22_Collections_Framework;

import java.util.*;
import java.util.Vector;

public class Ex_5_Vectors {
    public static void main(String[] args) {
        Vector v = new Vector();

        v.add("sarojini");
        v.add("Naidu");
        v.add("is");
        v.add("the nightingale");
        v.add("of India");
        v.add(123);
        v.addElement("erase");
        System.out.println(v);
        System.out.println("***");
        System.out.println(v.elementAt(6));
        System.out.println("***");
        System.out.println(v.firstElement());
        System.out.println("***");
        System.out.println(v.lastElement());
        System.out.println("***");
        System.out.println(v.removeElement(6));
        System.out.println(v);
        System.out.println("***");
        System.out.println(v.remove(5));
        System.out.println(v);
        System.out.println("***");
        System.out.println(v.capacity());

        System.out.println("--------");

        Iterator iterator = v.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Enumeration:
        System.out.println("----Enumeration----");
        Enumeration <String> e1 = v.elements();
        while (e1.hasMoreElements()) {
            System.out.println(e1.nextElement());
        }
    }
}
