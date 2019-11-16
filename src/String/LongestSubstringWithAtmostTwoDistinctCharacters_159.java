package String;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtmostTwoDistinctCharacters_159 {
    public static int lengthOfLongestSubstringTwoDistinct(String s){
        Map<Character, Integer> map = new HashMap<>();
        int res = 0,left = 0;
        for (int i = 0; i < s.length(); i++){
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),1);

            while (map.size()>2){
                if (map.get(s.charAt(left)) > 1){
                        map.put(s.charAt(left), map.get(s.charAt(left))-1);
                    }
                    else
                        map.remove(s.charAt(left));
                left++;
                }
            res = Math.max(res, i-left+1);
            }
        return res;
    }
    public static void main(String[] args){
        String s1 = "eceba";
        String s2 = "ccaabbb";
        System.out.println(lengthOfLongestSubstringTwoDistinct(s1));
        System.out.println(lengthOfLongestSubstringTwoDistinct(s2));
    }
}
