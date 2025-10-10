import java.util.Arrays;

public class RecursiveBubbleSort {
    static void Solution(int[] arr, int n) {
        // BASE CASE
        if (n == 1)
            return;
        for (int i = 0; i <= n - 2; i++) {
            if (arr[i] > arr[i + 1]) {
                arr[i] = arr[i] ^ arr[i + 1] ^ (arr[i + 1] = arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 2, 4, 11, 15 };
        System.out.println(Arrays.toString(arr));
        System.out.println("=======AFTER SORTING========");
        Solution(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
