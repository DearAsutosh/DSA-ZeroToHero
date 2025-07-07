package MustDoPatternProblemsBeforeStartingDsa;

public class pattern3 {
    public static void pattern(int size){
        for (int i = 1; i <=size; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern3.pattern(5);
    }
}

// OUTPUT
// ==========
// 1
// 12
// 123
// 1234
// 12345