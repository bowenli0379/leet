package Math;

import java.util.HashMap;
import java.util.Map;

public class StrobogrammaticNumberI_246 {
    public static boolean isStrobogrammatic(String s){
        Map<Character, Character> map = new HashMap<>();
        map.put('6','9');
        map.put('9','6');
        map.put('0','0');
        map.put('1','1');
        map.put('8','8');
        int i = 0, j = s.length()-1;
        while (i <= j){
            if (!map.containsKey(s.charAt(i)))
                return false;
            if (map.get(s.charAt(i++)) != s.charAt(j--))
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        String s1 = "69";
        String s2 = "88";
        String s3 = "962";
        System.out.println(isStrobogrammatic(s1));
        System.out.println(isStrobogrammatic(s2));
        System.out.println(isStrobogrammatic(s3));
    }
}
