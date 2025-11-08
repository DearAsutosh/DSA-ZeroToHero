package MapInterface;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(2,"Jyoti");
        tm.put(1,"Kanha");
        tm.put(4,"Debasish");
        System.out.println(tm);
        System.out.println(tm.get(tm.ceilingKey(3)));
        System.out.println(tm.floorKey(3));
        System.out.println(tm.keySet());
    }
}
