package MustDoPatternProblemsBeforeStartingDsa;

public class pattern13 {
    static void pattern(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern13.pattern(5);

    }
}

// OUTPUT
// =======
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15