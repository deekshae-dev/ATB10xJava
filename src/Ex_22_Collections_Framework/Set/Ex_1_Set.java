package Ex_22_Collections_Framework.Set;

import java.util.*;

public class Ex_1_Set {
    public static void main(String[] args) {
        Set hs  = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Many");
        hs.add("Lovely");
        hs.add("day");
        hs.add("day");
        hs.add("Day");
        System.out.println(hs);

    }


}
