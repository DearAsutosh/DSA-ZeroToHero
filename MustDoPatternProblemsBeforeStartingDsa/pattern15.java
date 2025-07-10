package MustDoPatternProblemsBeforeStartingDsa;

public class pattern15 {
    static void pattern(int n) {
        for (int i = n-1; i >=0; i--) {
            for (char ch = 'A'; ch <= 'A'+i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern15.pattern(5);

    }
}

// OUTPUT
// =======
// ABCDE
// ABCD
// ABC
// AB
// A