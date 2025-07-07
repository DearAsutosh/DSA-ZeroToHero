package MustDoPatternProblemsBeforeStartingDsa;

public class pattern1 {
    public static void pattern(int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1.pattern(5);
    }
}
