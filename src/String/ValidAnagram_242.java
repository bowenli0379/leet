package String;

public class ValidAnagram_242 {
    public static boolean isAnagram(String s, String t){
        int[] map = new int[26];
        for (int i = 0; i < s.length();i++){
            map[s.charAt(i)-'a']++;
        }
        for (int j = 0; j < t.length(); j++){
            map[s.charAt(j)-'a']--;
            if (map[s.charAt(j)-'a'] < 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
