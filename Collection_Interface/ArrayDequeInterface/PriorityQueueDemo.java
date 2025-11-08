package Collection_Interface.ArrayDequeInterface;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(1);
        pq.offer(5);
        pq.offer(4);
        pq.offer(0);
        System.out.println(pq);
        if (!pq.isEmpty())
        {
            System.out.println(pq.peek());
            System.out.println(pq.poll());
        }
        System.out.println(pq);
    }
}
