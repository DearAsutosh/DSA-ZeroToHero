import java.util.Scanner;

public class ReverseNumber {
    static int Solution(int a) {
        int res = 0;
        while (a != 0) {
           int ld=a%10;
            res =(res*10)+ld;
            a/=10;
        }
        return res;
    }

    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println(Solution(num));
        sc.close();
    }
}
