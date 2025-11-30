package Arrays_Problems.Easy;

import java.util.Arrays;

public class LeftRotateArrayByOne {
    public static void Solution(int[] arr, int index) {
        int lastItem=arr[0];
        for (int i = index; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = lastItem;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 10, 2, 25 };
        System.out.println(Arrays.toString(arr));
        Solution(arr, 1);
        System.out.println(Arrays.toString(arr));

    }
}
