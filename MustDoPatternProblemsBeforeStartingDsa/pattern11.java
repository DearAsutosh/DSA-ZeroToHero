package MustDoPatternProblemsBeforeStartingDsa;

public class pattern11 {
    static void pattern(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern11.pattern(5);
    }
}

// OUTPUT
// ==========
// 1
// 01
// 101
// 0101
// 10101