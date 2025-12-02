package Arrays_Problems.Easy;

public class _268_Missing_Number {
    public static int MissingNumber(int[] nums) {
        int n = nums.length;
        int realSum = (n * (n + 1)) / 2;
        int existingSum = 0;
        for (int num : nums) {
            existingSum += num;
        }
        return realSum - existingSum;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 8, 0 };
        System.out.println("Missing Number :" + MissingNumber(arr1));
    }
}
