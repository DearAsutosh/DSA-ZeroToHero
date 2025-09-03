import java.util.Scanner;

public class CountDigits {
    static int Solution(int num){
        //BRUTE-FORCE APPROACH
        // int count=0;
        // while (num!=0) {
        //     num/=10;
        //     count++;
        // }
        // return count;
        if (num==0) return 1;
        return (int)Math.log10(Math.abs(num))+1;
    }
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number :");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.println(Solution(num));
    }
}

