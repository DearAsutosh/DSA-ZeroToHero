package MustDoPatternProblemsBeforeStartingDsa;

public class pattern17 {
    static void pattern(int n) {
        char ch='A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern17.pattern(5);

    }
}

// OUTPUT
// =======
// A
// BB
// CCC
// DDDD
// EEEEE
