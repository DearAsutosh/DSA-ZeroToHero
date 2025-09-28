import java.util.HashMap;

public class CharacterHashing {
    public static void main(String[] args) {
        String s="Asutosh";
        HashMap<Character,Integer> map=new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        System.out.println("Frequency of 'a' : "+map.getOrDefault('a', 0));
        System.out.println("Frequency of 'A' : "+map.getOrDefault('A', 0));

    }
}
