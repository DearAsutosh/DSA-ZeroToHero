package MustDoPatternProblemsBeforeStartingDsa;

public class pattern10 {
    static void pattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 1; j<=i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i>0; i--) {
            for (int j = i-1;j>0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pattern10.pattern(5);
            }
}

// OUTPUT
// ==========
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *