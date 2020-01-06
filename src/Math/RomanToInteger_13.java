package Math;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {
    public static int romanToInt(String s){
        if (s == null || s.length() == 0)
            return 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length()-1; i++){
            if (map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
                sum -= map.get(s.charAt(i));
            else
                sum += map.get(s.charAt(i));
        }
        return sum + map.get(s.charAt(s.length()-1));
    }
    public static void main(String[] args){
        String s1 = "III";
        String s2 = "IV";
        String s3 = "IX";
        String s4 = "LVIII";
        String s5 = "MCMXCIV";
        System.out.println(romanToInt(s1));
        System.out.println(romanToInt(s2));
        System.out.println(romanToInt(s3));
        System.out.println(romanToInt(s4));
        System.out.println(romanToInt(s5));
    }
}
