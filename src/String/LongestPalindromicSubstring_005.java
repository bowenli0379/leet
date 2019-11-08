package String;

public class LongestPalindromicSubstring_005 {
    public static String longestPalindrome(String s){
        int len = s.length();
        int left = 0;
        int res = 0;
        boolean [][] dp = new boolean[len][len];
        for (int i = 0; i < s.length(); i ++){
            dp[i][i] = true;
            for (int j = 0; j < i; j++){
                dp[j][i] = (s.charAt(j) == s.charAt(i) && (dp[j+1][i-1] || i-j>2));
                if (dp[j][i] && res < i-j+1){
                    res = i - j +1;
                    left = j;

                }
            }
        }
        return s.substring(left, res);
    }
    public static void main(String[] args){
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}
