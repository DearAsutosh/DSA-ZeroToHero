package MustDoPatternProblemsBeforeStartingDsa;

public class pattern7 {
    public static void pattern(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern7.pattern(5);
    }
}

// OUTPUT
// ==========
//     *    
//    ***
//   *****
//  *******
// *********