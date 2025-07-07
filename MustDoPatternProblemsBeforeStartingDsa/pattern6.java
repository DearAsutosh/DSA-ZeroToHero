package MustDoPatternProblemsBeforeStartingDsa;

public class pattern6 {
    public static void pattern(int size){
        for (int i = size; i>=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern6.pattern(5);
    }
}

// OUTPUT
// ==========
// 12345
// 1234
// 123
// 12
// 1