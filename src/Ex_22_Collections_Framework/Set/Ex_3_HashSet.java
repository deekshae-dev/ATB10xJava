package Ex_22_Collections_Framework.Set;

import java.util.*;
import java.util.HashSet;

public class Ex_3_HashSet {
    public static void main(String[] args) {
        HashSet <String> hs = new HashSet<>();
        hs.add("Apple");
        hs.add("Cherry");
        hs.add("Guava");
        hs.add("Mango");
        hs.add("Mango");
        hs.add(null);
        System.out.println("elements are: " +hs);
     }
}
