package Ex_22_Collections_Framework.Map;

import java.util.Map;
import java.util.HashMap;
public class Ex_3_Map_Iterator {
    public static void main(String[] args) {
    Map<String,Integer> map = new HashMap<>();
    map.put("id1",1);
    map.put("id2",2);
    map.put("id3",3);
    map.put("id4",4);
    map.put(null,100);

    //iterate over these elements:
    for (Map.Entry<String,Integer> item: map.entrySet()) {
        System.out.println(item.getKey());
        System.out.println(item.getValue());
    }


    }

}
