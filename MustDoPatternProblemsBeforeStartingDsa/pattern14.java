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
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15