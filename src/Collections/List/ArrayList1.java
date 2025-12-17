package Collections.List;

import java.util.ArrayList;

public class  ArrayList1 {
    public static void main(String[] args) {

        //Arraylist is not a fixed size default size (10)
        ArrayList s=new ArrayList();
        s.add("Pugal");
        s.add(null);
        for(int i=0;i<10;i++){
            s.add(i);
        }
        s.set(1,50);//add the value in the index of 1

        System.out.println(s);
        System.out.println(s.contains(9));//it will return true or
        // false if value is there true if not return false
    }


}
