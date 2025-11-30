package Arrays_Problems.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllZerosToEnd {
    // public static int[] Solution(int[] arr) {
    // =========BRUTE FORCE APPROACH==========
    // List<Integer> zero = new ArrayList<>();
    // List<Integer> nonZero = new ArrayList<>();
    // for (int i : arr) {
    // if (i == 0) {
    // zero.add(i);
    // } else {
    // nonZero.add(i);
    // }
    // }
    // nonZero.addAll(zero);
    // int[] h = new int[nonZero.size()];
    // for (int i = 0; i < nonZero.size(); i++) {
    // h[i] = nonZero.get(i);
    // }
    // return h;
    // }

    // =========OPTIMIZED APPROACH =============

    public static void Solution(int[] arr) {
        int left = 0;
        for (int right = 0; right < arr.length; right++) {
            if (arr[right] != 0) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++; 
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 0, 1 };
        Solution(arr);
        System.out.println(Arrays.toString(arr));
    }
}