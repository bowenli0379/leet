package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedDNASequence_187 {
    public static List<String> findRepeatedDnaSequence(String s){
        List<String> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length()-10; i++){
            String str = s.substring(i,i+10);
            if (map.containsKey(str)){
                if (map.get(str) == 1) {
                    map.put(str, -1);
                    res.add(str);
                }
            }
            map.put(str, 1);
        }
        return res;
    }
    public static void main(String[] args){
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(findRepeatedDnaSequence(s));
    }
}
