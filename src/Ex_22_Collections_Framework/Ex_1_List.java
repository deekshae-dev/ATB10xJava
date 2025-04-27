package Ex_22_Collections_Framework;

import java.util.ArrayList;
import java.util.List;
public class Ex_1_List {
 public static void main(String[] args) {
     List cars = List.of("BMW", "Audi", "Ford", "Honda");
     //static method can be fully implemented in an interface
     //List.of() is a static method
     //immutable list it is
     //default method can also be fully implemented in interface
     //System.out.println(cars);
     //suppose if we want to add or remove here we cannot do this
     //because it is an unsupported operation
     //because add function in the list is incomplete in case of list
     //but of function si complete because of static
     //the list that we are creating is one time we can create
     //but we cannot add we cannot remove
     //cars.add("Buggati");  //java.lang.UnsupportedOperationException
     //cars.remove("Audi"); //Not Possible

//in general we need to use a concrete class to work with program
     ArrayList arraylist = new ArrayList();
     arraylist.add("Progress");
     arraylist.add("Achieve");
     arraylist.add("Excellence");
     arraylist.add("Achieve");
     //we can also add null in the list
     arraylist.add(null);
     arraylist.add(1234);
     System.out.println(arraylist);
     System.out.println(arraylist.size());

     // we can have parent reference with the child object here
     //basically we can do dynamic dispatch
     List l = new ArrayList();
     l.add("1234");
     l.add("2345");
     System.out.println(l);



 }
}
