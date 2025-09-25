package Basic_Recursion;

import java.util.Scanner;

public class SumofFirstNNumbers {
    static int Solution(int i, int n) {
        if (i > n)
            return 0;
        return i + Solution(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        System.out.println("Sum is :" + Solution(1, num));
        sc.close();
    }
}
