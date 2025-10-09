import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    static void mS(int[] arr, int low, int high) {
        if (low == high)
            return;
        int mid = (low + high) / 2;
        mS(arr, low, mid);
        mS(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int left = low, right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i-low);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 2, 1, 4, 3, 6 };
        System.out.println(Arrays.toString(arr));
        mS(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
