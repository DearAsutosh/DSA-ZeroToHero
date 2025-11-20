import java.util.Arrays;

public class QuickSort {
    public static void sort(int []arr,int low,int high){
    if (low<high) {
        int pivotIndex=partition(arr,low,high);
        sort(arr, low, pivotIndex-1);
        sort(arr, pivotIndex+1,high);
    }
    }
    public static int partition(int[] arr,int low,int high){
        int i=low-1;
        int pivot=arr[high];
        for (int j = low; j < high; j++) {
            if (arr[j]<=pivot) {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void main(String[] args) {
         int[] arr = { 20, 12,1,32,11 };
        System.out.println("Before sorting :");
        System.out.println(Arrays.toString(arr));
        System.out.println("After sorting :");
        sort(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
