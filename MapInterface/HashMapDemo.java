package MapInterface;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        //doesnt store the key in sorted order .
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"Kanha");
        hm.put(2,"Jyoti");
        hm.put(3,"Debasish");
        System.out.println(hm.get(3));
        System.out.println(hm.get(1));

        System.out.println("removed : "+hm.remove(2));
        System.out.println(hm);
    }
}
