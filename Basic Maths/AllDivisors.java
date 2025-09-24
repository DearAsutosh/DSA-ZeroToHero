import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AllDivisors {
    public static List<Integer> Solution(int n) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                nums.add(i);
                int pair = n / i;
                if (pair != i) {
                    nums.add(pair);
                }
            }
        }
        Collections.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(Solution(num).toString());
        sc.close();
    }
}
