package Collections.Map;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap t=new TreeMap();
//        t.put("hello",1);--->key wont allow hetrogenous
//        t.put(null,1); -->key null wont allow
//        it will not follow the order
        t.put(1,"hello");
        t.put(5,null);
        t.put(2,"hetro");
        System.out.println(t);
    }
}
