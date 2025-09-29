import java.util.HashMap;
import java.util.Map;

public class CountFrequenciesOfArrayElems {
    public static Map<Integer,Integer> countFrequencies(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        return map;
    }
    public static void main(String[] args) {
        int[] arr={12,1,1,2,3,2,45};
        Map<Integer,Integer> result=countFrequencies(arr);
        result.forEach((key,value)->{
            System.out.println(key+"->"+value);
        });
    }
}
