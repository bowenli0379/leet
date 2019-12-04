package DP;

public class UniquePaths_62 {
    public static int uniquePaths1(int m, int n){
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++)
            dp[i][0] = 1;
        for (int j = 0; j < n; j++)
            dp[0][j] = 1;

        for (int i = 1; i < m; i++){
            for (int j = 1; j < n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
    public static int uniquePaths2(int m, int n){
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i = 0; i < m; i ++){
            for (int j = 1; j < n; j++){
                dp[j] += dp[j-1];
            }
        }
        return dp[n-1];
    }
    public static void main(String[] args){
        int m = 3, n = 7;
        System.out.println(uniquePaths1(m, n));
        System.out.println(uniquePaths2(m, n));
    }
}
