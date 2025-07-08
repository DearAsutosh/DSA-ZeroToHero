package MustDoPatternProblemsBeforeStartingDsa;

public class pattern9 {
    public static void pattern(int size) {
       for (int i = 0; i < size; i++) {
        for (int j = 0; j < size-i-1; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < (2*i)+1; j++) {
            System.out.print("*");
        }
        for (int j = 0; j < size-i-1; j++) {
            System.out.print(" ");
        }
        System.out.println();
    }
    for (int i = size; i >0; i--) {
        for (int j = 0; j<size-i; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < (2*i)-1; j++) {
            System.out.print("*");
        }
        for (int j = 0; j < size-i; j++) {
            System.out.print(" ");
        }
        System.out.println();
       }
    }

    public static void main(String[] args) {
        pattern9.pattern(5);
    }
}

// OUTPUT
// ==========
//     *    
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *