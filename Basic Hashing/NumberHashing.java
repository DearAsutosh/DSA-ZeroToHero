import java.util.HashMap;

public class NumberHashing {
    public static void main(String[] args) {
        int[] arr = {12, 23, 21};
        HashMap<Integer, Integer> map = new HashMap<>();

        // Build frequency map
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Query
        System.out.println("Frequency of 10 is: " + map.getOrDefault(10, 0));
        System.out.println("Frequency of 12 is: " + map.getOrDefault(12, 0));
    }
}
