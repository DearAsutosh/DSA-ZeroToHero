import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HighOrLowestFrequency {
    public static int[] Max_Min_Freq(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr)
            map.put(i, map.getOrDefault(i, 0) + 1);
        int maxFreq = Integer.MIN_VALUE, minFreq = Integer.MAX_VALUE;
        for (int freq : map.values()) {
            if (freq > maxFreq)
                maxFreq = freq;
            if (freq < minFreq)
                minFreq = freq;
        }
        int maxElem = -1, minElem = -1;
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            if (i.getValue() == maxFreq && maxElem == -1)
                maxElem = i.getKey();
            if (i.getValue() == minFreq && minElem == -1)
                minElem = i.getKey();
        }
        return new int[] { minElem, maxElem };
    }

    public static void main(String[] args) {
        int[] arr = { 122, 23, 245, 50, 23, 1 };
        System.out.println(Arrays.toString(Max_Min_Freq(arr)));
    }
}
