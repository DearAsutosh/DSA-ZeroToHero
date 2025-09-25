package Basic_Recursion;

public class PalindromeCheck  {
    static boolean Solution(String str,int left,int right){
        if (left>=right) {
            return true;
        }
        if(str.charAt(left) != str.charAt(right)){
            return false;
        }
        return Solution(str,left+1,right-1);
    }
    public static void main(String[] args) {
        String str="iLi";
        if (Solution(str,0,str.length()-1)) {
            System.out.println(str+" is  a palindrome.");
        }else{
            System.out.println(str+" is NOT a palindrome.");
        }
    }
}
