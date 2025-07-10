package MustDoPatternProblemsBeforeStartingDsa;

public class pattern16 {
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
        pattern16.pattern(5);

    }
}

// OUTPUT
// =======
// A
// BB
// CCC
// DDDD
// EEEEE