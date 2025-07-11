package MustDoPatternProblemsBeforeStartingDsa;

public class pattern20 {
    static void pattern(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            int star = i < n - 1 ? i + 1 : 2 * n - i - 1;
            int space = i < n - 1 ? 2 * (n - i - 1) : 2 * (i - n + 1);
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern20.pattern(5);
    }
}
