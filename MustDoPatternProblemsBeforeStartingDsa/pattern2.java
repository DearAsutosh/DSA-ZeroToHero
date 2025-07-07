package MustDoPatternProblemsBeforeStartingDsa;

public class pattern2 {
    public static void pattern(int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern2.pattern(5);
    }
}

// OUTPUT
// ==========
// *
// **
// ***
// ****
// *****