package MustDoPatternProblemsBeforeStartingDsa;

public class pattern4 {
    public static void pattern(int size){
        for (int i = 1; i <=size; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern4.pattern(5);
    }
}

// OUTPUT
// ==========
// 1
// 22
// 333
// 4444
// 55555