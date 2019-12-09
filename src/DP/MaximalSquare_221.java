package DP;

public class MaximalSquare_221 {
    public static int maximalSqaure(int[][] matrix){
        int m = matrix.length, n = matrix[0].length;
        int res = 0;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (i == 0 || j == 0)
                    dp[i][j] = matrix[i][j];
                else if(matrix[i][j] == 1) {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
                }
                res = Math.max(res,dp[i][j]);
            }
        }
        return res * res;
    }
    public static void main(String[] args){
        int[][] matrix = {{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
        System.out.println(maximalSqaure(matrix));
    }
}
