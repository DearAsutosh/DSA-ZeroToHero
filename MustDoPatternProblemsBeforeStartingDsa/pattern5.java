package MustDoPatternProblemsBeforeStartingDsa;

public class pattern5 {
    public static void pattern(int size){
        for (int i = size; i >0; i--) {
            for (int j=i; j >0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern5.pattern(5);
    }
}

// OUTPUT
// ==========
// *****
// ****
// ***
// **
// *