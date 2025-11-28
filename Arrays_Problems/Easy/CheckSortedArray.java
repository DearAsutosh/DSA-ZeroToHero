package Arrays_Problems.Easy;

import java.util.Arrays;

public class CheckSortedArray {
    public static boolean sortedOrNot(int[] arr){
        //brute-force approach
        // for(int i=0;i<arr.length-2;i++){
            // for (int j = i+1; j < arr.length; j++) {
            //     if (arr[j]<arr[i]) {
            //         return false;
            //     }
            // }
        // }

        //optiml approach
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<arr[i-1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = { 20, 12, 1, 32, 11,9 };
        // Arrays.sort(arr);//for testing
        System.out.println("Sorted :" + sortedOrNot(arr));
    }
}
