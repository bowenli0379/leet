package String;

import java.util.HashMap;
import java.util.Map;

public class WordPattern_290 {
    public static boolean wordPattern(String pattern, String str){
        char[] charofPattern = pattern.toCharArray();
        String[] strofStr = str.split(" ");
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++){
            if (map.containsKey(charofPattern[i])){
                if (!map.get(charofPattern[i]).equals(strofStr[i]))
                    return false;
            }
            else if (map.containsValue(strofStr[i])){
                return false;
            }
            map.put(charofPattern[i], strofStr[i]);
        }
        return true;
    }
    public static void main(String[] args){
        String pattern = "abba";
        String str1 = "dog cat cat dog";
        String str2 = "dog cat cat fish";
        System.out.println(wordPattern(pattern, str1));
        System.out.println(wordPattern(pattern, str2));
    }
}
