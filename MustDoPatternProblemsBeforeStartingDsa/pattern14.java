package MustDoPatternProblemsBeforeStartingDsa;

public class pattern14 {
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A'+i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern14.pattern(5);

    }
}

// OUTPUT
// =======
// A
// AB
// ABC
// ABCD
// ABCDE