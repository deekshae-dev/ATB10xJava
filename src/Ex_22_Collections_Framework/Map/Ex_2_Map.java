package Ex_22_Collections_Framework.Map;

import java.util.HashMap;
import java.util.Map;
public class Ex_2_Map {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("null","123");
        m1.put("null","234");
        m1.put("Name","Mythri");
        m1.put("Rollno.","23");
        m1.put("id",1);
        m1.put("id",2);
        m1.put("id1",3);
        m1.put("id2",4);
        m1.put("id3",5);
        System.out.println(m1);
        System.out.println("***");
        System.out.println(m1.size());
        System.out.println("***");
        System.out.println(m1.isEmpty());
        System.out.println("***");
        System.out.println(m1.containsKey("Name"));
        System.out.println("***");
        System.out.println(m1.containsValue("23"));
        System.out.println("***");
        System.out.println(m1.get("id1"));
        System.out.println("***");
        System.out.println(m1.remove("id3"));
        System.out.println(m1);
        System.out.println("***");
        System.out.println(m1.keySet());
        System.out.println("***");
        System.out.println(m1.entrySet());
        System.out.println("***");
        System.out.println(m1.putIfAbsent("id2",4));
        System.out.println(m1);
        System.out.println("***");
        System.out.println(m1.putIfAbsent("id4",7));
        System.out.println(m1);
        System.out.println("***");
        System.out.println(m1.replace("id4",10));
        System.out.println(m1);
        System.out.println("***");




    }
}
