package Ex_22_Collections_Framework.Queue;

import java.util.PriorityQueue;

public class Ex_1_Queue {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.add("Rashmi");
        q.add("Nakshatra");
        q.offer("Makeup");
        q.offer("Lovely");//add
        System.out.println(q);
        System.out.println("***");
        System.out.println(q.peek());//see the first element
        System.out.println("***");
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println("***");
    }
}
