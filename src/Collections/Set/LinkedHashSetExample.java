package Collections.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
//it wil remove the duplicate and it wil follow the natural order
//    it will allow the 1 null
//    it will allow hetrogenus
    public static void main(String[] args) {
        LinkedHashSet h=new LinkedHashSet();
        h.add("Bmw");
        h.add("suzuki");
        h.add("Audi");
        h.add("Bmw");
        h.add("Bmw");
        h.add("Hyundai");
        h.add(null);
        h.add(null);
        h.add(1);
        h.add(2);
        h.add(1);
        System.out.println(h);

    }
}
