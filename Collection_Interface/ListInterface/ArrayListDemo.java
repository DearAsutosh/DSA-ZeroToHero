package Collection_Interface.ListInterface;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> aList=new ArrayList<>();
        aList.add(10);
        aList.add(16);
        aList.add(5);
        aList.add(30);
        System.out.println(aList);
        System.out.println(aList.size());
        System.out.println(aList.get(3));
        System.out.println(aList.remove(2));
        System.out.println(aList);
        aList.add(2,5);
        System.out.println(aList);
        System.out.println(aList.contains(10));
    }
}
