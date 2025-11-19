package src.Collections.Set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
//  set will allow only the unique value
// hashset  is unordered list
        // only one null value accept
        HashSet h=new HashSet();
        h.add("karur");
        h.add("karur");
        h.add("namakkal");
        h.add("namakkal");
        h.add("salem");
        h.add(1);
        h.add(2);
        h.add(2);
        h.add(8);
        h.add(10);
        h.add(null);
        h.add(null);
           System.out.println(h);


    }
}
