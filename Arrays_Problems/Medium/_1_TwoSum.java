package Arrays_Problems.Medium;

import java.util.Arrays;

public class _1_TwoSum {
    public static int[] TwoSum(int[] nums,int target){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if((nums[i] + nums[j] )==target && i!=j){
                    return new int[]{i,j};
                }        
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr1 = { 1,3,2,5,4,6 };
        System.out.println("umber having single occurency N:" + Arrays.toString(TwoSum(arr1,10)) );
    }
}
