import java.util.Scanner;

public class CheckPalindrome {
    static boolean palindrome(int n) {
        int revNum = 0;
        int dup = n;
        while (n > 0) {
            int ld = n % 10;
            revNum = (revNum * 10) + ld;
            n /= 10;
        }
        if (dup == revNum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (palindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}