package Arrays_Problems.Easy;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class UnionofTwoSortedArray {
    public static ArrayList<Integer> findUnion(int[] arr1,int[] arr2){
        Set<Integer> st=new TreeSet<>();
        for (int i : arr1) {
            st.add(i);
        }
        for (int i : arr2) {
            st.add(i);
        }
        return new ArrayList<>(st);
    }
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr2 = { 2, 3, 4, 4, 5, 11, 12 };
        ArrayList<Integer> union=findUnion(arr1,arr2);
        System.out.println(union.toString());
    }
}