package Collection_Interface.ListInterface;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        System.out.println(ll.add(23));
        System.out.println(ll.add(3));
        System.out.println(ll.add(40));
        System.out.println(ll.add(8));
        System.out.println(ll);
        ll.addFirst(12);
        ll.addLast(21);
        System.out.println(ll);
    }
}
