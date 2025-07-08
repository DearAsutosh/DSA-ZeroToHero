package MustDoPatternProblemsBeforeStartingDsa;

public class pattern12 {
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= 2 *(n - i - 1); j++) {
                System.out.print(" ");
            }
            
            for (int j = i+1; j >0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern12.pattern(4);

    }
}
