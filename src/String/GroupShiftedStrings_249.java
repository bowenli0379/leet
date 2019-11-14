package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupShiftedStrings_249 {
    public static List<List<String>> groupStrings(String[] strings){
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strings){
            char[] chars = str.toCharArray();
            int diff = chars[0] - 'a';
            for (int i = 0; i < chars.length; i++){
                if (chars[i] - diff < 'a')
                    chars[i] = (char) (chars[i] - diff + 26);
                else
                    chars[i] = (char) (chars[i] - diff);

            }
            String charstoStr = String.valueOf(chars);
            if (!map.containsKey(charstoStr))
                map.put(charstoStr, new ArrayList<String>());
            map.get(charstoStr).add(str);

        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args){
        String[] s ={"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"};
        System.out.println(groupStrings(s));
    }
}
