import java.util.HashMap;
import java.util.Map;

public class NumberHashing {
    // public static void main(String[] args) {
    // int[] arr = {12, 23, 21};
    // HashMap<Integer, Integer> map = new HashMap<>();

    // // Build frequency map
    // for (int i : arr) {
    // map.put(i, map.getOrDefault(i, 0) + 1);
    // }

    // // Query
    // System.out.println("Frequency of 10 is: " + map.getOrDefault(10, 0));
    // System.out.println("Frequency of 12 is: " + map.getOrDefault(12, 0));
    // }

    //==========optimized APPROACH =========
    public static Map<Integer, Integer> countFrequencies(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        int[] arr={1,2,1,321,2,139};
        Map<Integer,Integer> result=countFrequencies(arr);

        //print all key-value pair
        for (Map.Entry<Integer, Integer> e : result.entrySet()) {
            System.out.println(e.getKey()+" -->  "+e.getValue());
        }

        //example query
        System.out.println("Frequency of 2 :"+result.getOrDefault(2, 0));
    }
}
