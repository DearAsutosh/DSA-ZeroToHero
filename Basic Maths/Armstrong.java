public class Armstrong {
    public static boolean isArmstrong(int n) {
        int digits = String.valueOf(n).length();
        System.out.println(String.valueOf(n)
                    .chars());
        return n == String.valueOf(n)
                    .chars()
                    .map(c -> (int) Math.pow(c - '0', digits))
                    .sum();
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));   // true
        System.out.println(isArmstrong(9474));  // true
        System.out.println(isArmstrong(123));   // false
    }
}
