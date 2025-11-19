package Collections.Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.add(1);
        q.add(0);
        q.add(3);
        q.add(20);
//        q.add(null); null will not allowed
//        q.add("pugal"); hetrogenous will not allowed

        System.out.println(q);//it sort and give
        System.out.println("Before removing Head"+" " +q.peek());//head
        q.remove();//it will take the header
        System.out.println("removed value "+""+q.poll());//it will return removed value if the there is no
        // value i will not give error only it will null
        System.out.println("After removing head  "+" "+q.peek());

        while (!q.isEmpty()) {
            System.out.println(q.poll());//for natural order follow
        }
    }
}
