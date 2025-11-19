package Collections.List;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {


        LinkedList l = new LinkedList();
        l.add("Pugal");
        l.add(1);
        l.add(null);
        l.set(2,90);
        System.out.println(l.contains(90));
        System.out.println("Head"+" " +l.peek());
        System.out.println(l);

    }
}
