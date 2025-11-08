package Collection_Interface.SetInterface;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(01);
        hs.add(0);
        hs.add(10);
        System.out.println(hs);
        System.out.println(hs.remove(1));
        System.out.println(hs);
    }
}
