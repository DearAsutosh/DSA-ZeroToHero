package MustDoPatternProblemsBeforeStartingDsa;

public class pattern22 {
    static void pattern(int n){
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                int top=i;
                int left=j;
                int bottom=(2*n-2)-i;
                int right=(2*n-2)-j;
                System.out.print(n- Math.min(Math.min(left,right), Math.min(top,bottom)));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    pattern22.pattern(4);
    }
}