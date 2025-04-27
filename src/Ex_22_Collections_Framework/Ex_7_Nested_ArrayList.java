package Ex_22_Collections_Framework;

import java.util.ArrayList;
import java.util.List;

public class Ex_7_Nested_ArrayList {
    public static void main(String[] args) {


        List <String> fruits1 = new ArrayList<>();
        fruits1.add("Apple");
        fruits1.add("Mango");
        fruits1.add("Litchi");
        System.out.println(fruits1);
        System.out.println("***");

        List  fruits2 = new ArrayList<>();
        fruits2.add("grapes");
        fruits2.add("Banana");
        fruits2.add("Cherry");
        System.out.println(fruits2);
        System.out.println("***");

        List vegetables = new ArrayList<>();
        vegetables.add("Tomato");
        vegetables.add("Chilly");
        vegetables.add("Brinjal");
        System.out.println(vegetables);
        System.out.println("***");

        List allItems = new ArrayList<>();
        allItems.add(fruits1);
        allItems.add(fruits2);
        allItems.add(vegetables);
        System.out.println(allItems);
        System.out.println("***");
        System.out.println(allItems.get(0));

    }
}
