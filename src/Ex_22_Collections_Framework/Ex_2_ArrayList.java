package Ex_22_Collections_Framework;

import java.util.ArrayList;
import java.util.List;


public class Ex_2_ArrayList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("true");
        list.add(1234);
        list.add('d');
        list.add(3,"key");
        list.set(5,"Ram");
        list.remove(4);


        System.out.println(list.isEmpty());
        System.out.println("***");
        System.out.println(list.size());
        System.out.println("***");
        System.out.println(list.contains("1"));
        System.out.println("***");
        System.out.println(list.contains("5"));
        System.out.println("***");
        System.out.println(list.indexOf("true"));
        System.out.println("***");
        System.out.println(list);
        System.out.println("***");
        System.out.println(list.get(4));
        System.out.println("***");
        System.out.println(list.lastIndexOf("true"));
        System.out.println("***");



        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
            System.out.println("***");
        }



    }
}
