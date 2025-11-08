package Collection_Interface.ArrayDequeInterface;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.offer(2);
        ad.offer(32);
        ad.offer(1);
        ad.offer(9);
        ad.offer(56);
        System.out.println(ad);
        ad.poll();
        System.out.println(ad.peekFirst());
    }
}
