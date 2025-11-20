// import java.util.Arrays;

// public class InsertionSort {
//     static void Solution(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i+1; arr[i] < arr[j]; j++) {
//                 if (j > 0) {
//                     int temp=arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 12, 2, 1, 4, 3, 6 };
//         System.out.println(Arrays.toString(arr));
//         // mS(arr, 0, arr.length - 1);
//         Solution(arr);
//         System.out.println(Arrays.toString(arr));
//     }
// }

// =============Recursive insertion sort===============

import java.util.Arrays;

class Test {
    public static void sort(int[] arr, int n) {
        if (n <= 1) {
            return;
        }
        sort(arr, n-1);
        int last=arr[n-1],j=n-2;
        while (j>=0 && arr[j]>last) {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=last;
    }

    public static void main(String[] args) {
        int[] arr = { 20, 12,1,32,11 };
        System.out.println("Before sorting :");
        System.out.println(Arrays.toString(arr));
        System.out.println("After sorting :");
        sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
