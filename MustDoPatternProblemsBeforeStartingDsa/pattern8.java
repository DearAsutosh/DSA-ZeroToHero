package MustDoPatternProblemsBeforeStartingDsa;

public class pattern8 {
    public static void pattern(int size) {
        for (int i = size-1; i >=0; --i) {
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
        pattern8.pattern(5);
    }
}

// OUTPUT
// ==========
//  *********
//  *******
//   *****
//    ***
//     *