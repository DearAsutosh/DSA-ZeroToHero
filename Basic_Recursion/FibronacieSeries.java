package Basic_Recursion;

public class FibronacieSeries {
    static int Solution(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        return Solution(n-1)+Solution(n-2);
    }
    public static void main(String[] args) {
        int num=10;
        System.out.println("Fibronacie series up to "+num+" terms : ");
        for (int i = 0; i < num; i++) {
            System.out.print(Solution(i)+"\t");
        }
    }
}
