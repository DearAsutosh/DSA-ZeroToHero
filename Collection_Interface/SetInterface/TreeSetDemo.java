package Collection_Interface.SetInterface;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(13);
        ts.add(10);
        ts.add(5);
        ts.add(-2);
        System.out.println(ts);
        System.out.println(ts.floor(0));
        System.out.println(ts.ceiling(6));
    }
}
