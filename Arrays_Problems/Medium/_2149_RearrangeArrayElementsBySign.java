package Arrays_Problems.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2149_RearrangeArrayElementsBySign {
   static public int[] rearrangeArray(int[] nums) {
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        for (int num : nums) {
            if (num >= 0)
                positive.add(num);
            else
                negative.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                nums[i] = positive.get(i / 2);
            else
                nums[i] = negative.get(i / 2);
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, -2, -5, 2, -4 };
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
}