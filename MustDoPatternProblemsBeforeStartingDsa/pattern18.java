package MustDoPatternProblemsBeforeStartingDsa;

public class pattern18 {
    static void pattern(int n){
        for (int i = 0; i < n; i++) {
            char ch=(char)('A'+n-1-i);
            for (int j = 0; j <=i; j++) {
                System.out.print((char)(ch+j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    pattern18.pattern(5);
    }
}

//output
// ========
// E
// DE
// CDE
// BCDE
// ABCDE