package Arrays;
import java.util.Arrays;

public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j > i; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = { 3,2,4 };
        int[] res = twoSum(arr, 6);
        System.out.println(Arrays.toString(res));
    }
}