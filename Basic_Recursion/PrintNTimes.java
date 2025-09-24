package Basic_Recursion;
public class PrintNTimes {
static int cnt=0;
public static void Solution(){
    // System.out.println("Recursion starts here...");
    if(cnt==5) return;
    ++cnt;
    System.out.println(cnt);
    Solution();
}
public static void main(String[] args) {
    Solution();
}
}
