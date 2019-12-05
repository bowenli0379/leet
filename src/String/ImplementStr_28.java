package String;

public class ImplementStr_28 {
    public static int strStr1(String haystack, String needle){
        if (needle == null) return 0;
        int m = haystack.length(), n = needle.length();
        if (m < n) return -1;
        for (int i = 0; i <= m - n; i++){
            int j = 0;
            for (j = 0; j < n; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) break;
            }
            if (j == n)
                return i;
        }
        return -1;
    }
    public static int strStr2(String haystack, String needle){
        if (haystack == null || needle == null || needle.length() > haystack.length())
            return -1;
        if (needle.length() == 0)
            return 0;
        for (int i = 0 ; i < haystack.length()-needle.length(); i++){
            if (haystack.substring(i, i+needle.length()).equals(needle))
                return i;
        }
        return -1;
    }
    public static void main(String[] args){
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr1(haystack, needle));
        System.out.println(strStr2(haystack, needle));
    }
}
