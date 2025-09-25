package Basic_Recursion;

import java.util.Arrays;

public class ReverseArray {
    static void Solution(int[] arr,int left,int right){
        if(left>=right)return;

        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        //recursive call
        Solution(arr, left+1, right-1);
    }
    public static void main(String[] args) {
        int[] abc={2,54,20,15,12,60};
        Solution(abc, 0, abc.length-1);
        System.out.println(Arrays.toString(abc));
    }
}
