package DP;

import java.util.ArrayList;
import java.util.List;

public class WordBreak_139 {
    public static boolean wordBreak(String s, List<String> dict){
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++){
            for (int j = 0; j < i; j++){
                String temp = s.substring(j, i);
                if (dp[j] && dict.contains(temp)){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
    public static void main(String[] args){
        String s = "leetcode";
        List<String> dict = new ArrayList<>();
        dict.add("leet");
        dict.add("code");
        System.out.println(wordBreak(s, dict));
    }
}
