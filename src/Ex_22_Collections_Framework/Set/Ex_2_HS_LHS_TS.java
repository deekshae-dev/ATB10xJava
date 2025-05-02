package Ex_22_Collections_Framework.Set;

import java.util.*;

public class Ex_2_HS_LHS_TS {
    public static void main(String[] args) {
        //No order, no duplicates, can add 1 null only
        Set <String> hs = new HashSet();
        hs.add("Apple");
        hs.add("Cherry");
        hs.add("Guava");
        hs.add("Mango");
        hs.add("Mango");
        hs.add(null);
        System.out.println(hs);

        System.out.println("----------------");

        //order is maintained,no duplicates
        Set lhs = new LinkedHashSet();
        lhs.add("ravi");
        lhs.add("Mayuri");
        lhs.add("Baseball");
        lhs.add("Carroms");
        lhs.add("ravi");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println("***");
        System.out.println(lhs.isEmpty());
        System.out.println("***");
        System.out.println(lhs.contains("ravi"));
        System.out.println(lhs.contains("Nitya"));
        System.out.println("***");
        System.out.println(lhs.add("Ram"));
        System.out.println(lhs);
        System.out.println("***");
        System.out.println(lhs.size());
        System.out.println("***");

        System.out.println("----------------");

        //uses red & black tree mechanism to store the elements
        //order is maintained, Natural sorting is done based on
        //alphabetical order automatically based on the 1st element
        //null is not allowed
        //entering different types of elements as input is also not allowed
        Set ts = new TreeSet();
        ts.add("Zaid");
        ts.add("Chanda");
        ts.add("Amogh");
        ts.add("Radha");
        //ts.add(null);---->Not allowed
        System.out.println(ts);

        System.out.println("----------------");

        System.out.println("----for each----");
        for(Object o1 : ts) {
            System.out.println(o1);
        }




    }
}
