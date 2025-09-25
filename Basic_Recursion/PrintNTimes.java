package Basic_Recursion;

import java.util.Scanner;

public class PrintNTimes {
    static int cnt;

    public static void Solution(int i,int n) {

        // print 1 to n
        //=======Basic Approach=========
        // if (cnt == n)
        //     return;
        // ++cnt;
        // System.out.println(cnt);
        // Solution(n);
        // System.out.println("returning after recursion..");
        //=======Optimal Approach========
        // if(i>n)return;
        // System.out.println(i);
        // Solution(i+1, n);

        // print n to 1
        if (i<1) return;
        System.out.println(i);
        Solution(i-1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        Solution(num,num);
        sc.close();
    }
}
