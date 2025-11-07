import java.util.Arrays;

public class InsertionSort {
    static void Solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; arr[i] < arr[j]; j++) {
                if (j > 0) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 2, 1, 4, 3, 6 };
        System.out.println(Arrays.toString(arr));
        // mS(arr, 0, arr.length - 1);
        Solution(arr);
        System.out.println(Arrays.toString(arr));
    }
}
