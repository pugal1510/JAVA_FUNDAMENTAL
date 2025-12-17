package Collections.Map;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
//        it will the hetrogeneous for both key value
//        it will allow only 1 null if add one more means i will remove the old one(key),v->any
//        only unique value allow for key if u give it will take the lastest one remove the old one
//        it will not retun in insertion order

        HashMap h=new HashMap();
        h.put(1,"hello");
        h.put(2,"hii");
        h.put(3,"eee");
        h.put("hello",3);
        h.put(null,1);
        h.put(null,2);
        h.put(3,"www");
        System.out.println(h);
    }
}
