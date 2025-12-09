package Arrays_Problems.Medium;

public class _53_maximumSubarray {
    public static int Solution(int[] nums) {
        int res = nums[0];
        int total = 0;
        for (int n : nums) {
            if (total < 0) {
                total = 0;
            }
            total += n;
            res = Math.max(total, res);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 0, 2, 1, 1, 0 };
        System.out.println(Solution(arr1));
    }
}