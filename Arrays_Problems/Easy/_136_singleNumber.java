package Arrays_Problems.Easy;

import java.util.HashMap;
import java.util.Map;

public class _136_singleNumber {
    public static int SingleNumber(int[] nums){
        //basic brute force approach
        Map<Integer,Integer> map=new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for (int key : map.keySet()) {
            if (map.get(key)==1) {
                return key;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0,2,2,3 };
        System.out.println("Number having single occurency :" + SingleNumber(arr1));

    }
}
