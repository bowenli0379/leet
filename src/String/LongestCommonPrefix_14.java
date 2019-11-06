package String;

public class LongestCommonPrefix_14 {
    public static String longestCommonPrefix(String[] strs){
        if (strs == null || strs.length == 0) return "";
        String res = new String();
        for (int i = 0; i < strs[0].length(); i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++){
                if (i >= strs[j].length() || strs[j].charAt(i) != c)
                    return res;
            }
            res += Character.toString(c);
        }
        return res;
    }
    public static void main(String[] args){
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
