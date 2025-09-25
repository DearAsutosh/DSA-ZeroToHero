package Basic_Recursion;

public class Factorial {
    static int Solution(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * Solution(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(Solution(5));
    }
}