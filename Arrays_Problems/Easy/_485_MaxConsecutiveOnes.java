package Arrays_Problems.Easy;
public class _485_MaxConsecutiveOnes {
    public static int MaxConsecutiveArray(int[] nums) {
        int n = nums.length, cnt = 0, max1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                cnt++;
            } else
                cnt = 0;
            max1 = Math.max(max1, cnt);
        }
        return max1;
    }
    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0 };
        System.out.println("Missing Number :" + MaxConsecutiveArray(arr1));
    }
}