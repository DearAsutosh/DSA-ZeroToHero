package Arrays_Problems.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static int Solution(int[] arr,int target){
        for (int i=0;i<arr.length;i++) {
            if (arr[i]==target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int[] arr = { 12, 10, 2, 25,12,1,1,9,3 };
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the Target : ");
        int target=sc.nextInt();
        System.out.println(Solution(arr,target));
        sc.close();
    }
}
