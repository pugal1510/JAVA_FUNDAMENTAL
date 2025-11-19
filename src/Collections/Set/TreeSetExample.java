package Collections.Set;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        //i will sort the give
        //it will not allow the duplicate
        //it will not allow the hetrogenous
//        it will not allow the null evem 1 null also it wont allow
        TreeSet t=new TreeSet();
        t.add(1);
        t.add(5);
        t.add(7);
        t.add(2);
        t.add(1);
//        t.add(null);
//        t.add("puhl");
//        t.add("apple");
        System.out.println(t);
    }
}
