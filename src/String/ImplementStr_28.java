package String;

public class ImplementStr_28 {
    public static int strStr(String haystack, String needle){
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
    public static void main(String[] args){
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));
    }
}
