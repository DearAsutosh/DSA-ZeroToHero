import java.util.Arrays;

public class SelectionSort {

    // Function to perform Selection Sort (Ascending order)
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // assume current element is minimum

            // Find index of smallest element in unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap only if needed (to reduce unnecessary swaps)
            if (minIndex != i) {
                swap(arr, i, minIndex);
            }
        }
    }

    // Utility swap function (for cleaner code)
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Driver method to test the algorithm
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Before Sorting: " + Arrays.toString(arr));

        selectionSort(arr); // sort in ascending order

        System.out.println("After Sorting:  " + Arrays.toString(arr));
    }
}
