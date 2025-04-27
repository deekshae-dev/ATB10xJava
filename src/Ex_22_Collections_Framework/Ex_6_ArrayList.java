package Ex_22_Collections_Framework;
import java.util.*;
import java.util.List;
public class Ex_6_ArrayList {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add("Milk");
        l1.add("butterMilk");
        l1.add("Yogurt");
        l1.add("Cherry");
        l1.add("Jam");
        l1.add(123456);
        System.out.println(l1);
        System.out.println("***");
        System.out.println(l1.size());
        System.out.println("***");
        System.out.println(l1.isEmpty());
        System.out.println("***");
        System.out.println(l1.contains(1));
        System.out.println("***");
        System.out.println(l1.contains("Jam"));
        System.out.println("***");

        System.out.println("---Default for loop---");
        //if we want to print or check an individual element then we use for loop
        for (int i = 0; i < l1.size(); i++) {

            System.out.println(l1.get(i));
        }
        System.out.println("***");

        System.out.println("---Foreach loop---");
        for (Object o : l1) {
            //here we have taken object as it contains multiple types of data
            //if all of them are string type then we would have used String
            System.out.println(o);
        }
        System.out.println("***");

        System.out.println("---to print arraylist iterator---");
        //iterator has 2 functions:
        //1)hasNext() -> give you true until the iteration is complete
        //2)Next() -> this will give you the element
        Iterator i1 = l1.iterator(); {
        while(i1.hasNext()) {
            System.out.println(i1.next());
        }
            System.out.println("***");
        }

    }


}
