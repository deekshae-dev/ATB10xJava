package Ex_22_Collections_Framework;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
public class Ex_10_Arraylist_Iteration {
    public static void main(String[] args) {

        List <String> mylist= new ArrayList<>();
        mylist.add("Hi!!");
        mylist.add("Hello!!");
        mylist.add("How are you doing?");
        mylist.add("Have a nice day:)");

        //printing elements using println():
        System.out.println("To print arraylist - 1" +mylist);
        System.out.println("***");

        //printing elements using for loop:
        for(int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }
        System.out.println("***");

        //printing elements using for each loop:
        for(String s1 : mylist) {
            System.out.println(s1);
        }
        System.out.println("***");

        //printing elements using iterator:
        Iterator <String> i1 = mylist.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
        System.out.println("***");
    }
}
