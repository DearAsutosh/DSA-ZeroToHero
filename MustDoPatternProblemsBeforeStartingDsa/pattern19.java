package MustDoPatternProblemsBeforeStartingDsa;

public class pattern19 {
    static void pattern(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int star = i < n ? n - i : i - n + 1;
            int space = i < n ? 2 * i : 2 * (2 * n - i - 1);
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
        pattern19.pattern(5);
    }
}

// output
// ======
// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********
