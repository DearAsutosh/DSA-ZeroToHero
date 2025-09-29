import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterHashing {
    // public static void main(String[] args) {
    // String s="Asutosh";
    // HashMap<Character,Integer> map=new HashMap<>();
    // for (char ch : s.toCharArray()) {
    // map.put(ch, map.getOrDefault(ch, 0)+1);
    // }
    // System.out.println("Frequency of 'a' : "+map.getOrDefault('a', 0));
    // System.out.println("Frequency of 'A' : "+map.getOrDefault('A', 0));

    // }

    // ==========OPTIMIZED APPROACH=========
    public static Map<Character, Integer> countCharFrequency(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        String s = "Asutosh";
        Map<Character, Integer> result = countCharFrequency(s);
        // for (Map.Entry<Character,Integer> e : result.entrySet()) {
        // System.out.println(e.getKey()+" --> "+e.getValue());
        // }
        result.forEach((key, value) -> {
            System.out.println(key + " -->  " + value);
        });
    }
}
