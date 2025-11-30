package Arrays_Problems.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateAnArray {
    public static void Solution(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] rotated = new int[n];
        for (int i = 0; i < rotated.length; i++) {
            rotated[(k + i) % n] = arr[i];
        }
        for (int i = 0; i < rotated.length; i++) {
            arr[i] = rotated[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 12, 10, 2, 25 };
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter Kth position : ");
        int n = sc.nextInt();
        Solution(arr, n);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
