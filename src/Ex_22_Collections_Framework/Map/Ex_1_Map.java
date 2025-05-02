package Ex_22_Collections_Framework.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ex_1_Map {
    public static void main(String[] args) {
      Map m1  = new HashMap();
      //insertion order is not maintained
      m1.put("Name","Pramila");
      m1.put("RollNo.","1");
      m1.put("ContactNo.","87654321");
      System.out.println(m1);

      System.out.println("-----");

      Map m2  = new HashMap();
      //insertion order is maintained
      m2.put("Name","Pradhan");
      m2.put("RollNo.","2");
      m2.put("ContactNo.","12345678");
      System.out.println(m2);

      System.out.println("-----");

      Map m3  = new TreeMap();
      //keeps the elements sorted in ascending order
      m3.put("Name","Mamamtha");
      m3.put("RollNo.", "3");
      m3.put("ContactNo." ,"34267272");
      System.out.println(m3);


    }

}
