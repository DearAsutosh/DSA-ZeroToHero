public class GCD {
    public static int Solution(int a,int b){
        //brute-force attack
        // int GCD=1;
        // for (int i = 1; i <= Math.min(a , b); i++) {
        //     if (a%i==0 && b%i==0) {
            //         GCD=i;
            //     }
            // }
            // return GCD;
            
            
        //OPTIMAL approach
       while (a>0 && b>0) {
        if (a>b) {
            a=a%b;
        }else{
            b=b%a;
        }
       }
       if (a==0) {
        return b;
       }return a;

    }
    public static void main(String[] args) {
        int a=3,b=1;
        int gcd=Solution(a,b);
        System.err.println("GCD ="+gcd);

    }
}
