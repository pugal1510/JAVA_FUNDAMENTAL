package Collections.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        //        it will the hetrogeneous for both key value
//        it will allow only 1 null if add one more means i will remove the old one(key),v->any
//        only unique value allow for key if u give it will take the lastest one remove the old one
//it will retun in insertion order
        LinkedHashMap l=new LinkedHashMap();
        l.put(1,"pugal");
        l.put(2,"rithika");
        l.put(3,"gift");
        l.put(null,1);
        l.put(null,2);
        System.out.println(l);
    }
}
