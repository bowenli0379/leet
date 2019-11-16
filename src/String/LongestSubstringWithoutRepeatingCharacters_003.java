package String;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters_003 {
    public static int lengthOfLongestSubstring(String s){
        int[] map = new int[256];
        Arrays.fill(map, -1);
        int res = 0, left = -1;
        for (int i = 0; i < s.length(); i++){
            left = Math.max(left, map[s.charAt(i)]);
            map[s.charAt(i)] = i;
            res = Math.max(res, i-left);
        }
        return res;
    }
    public static void main(String[] args){
        String s1 = "abcabcbb";
        String s2 = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
    }
}
