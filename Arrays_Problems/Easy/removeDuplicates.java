package Arrays_Problems.Easy;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicates {
    public static int removeDuplicates(int[] arr){
        Set<Integer> set=new HashSet<>();
        int index=0;
        for (Integer num : set) {
            if (!set.contains(num)) {
                set.add(num);
                arr[index]=num;
                index++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = { 20, 12, 1, 32, 11,9 };
        // Arrays.sort(arr);//for testing
        System.out.println(removeDuplicates(arr));
    }
}
