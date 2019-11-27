package Array;

public class TrappingRainWater_42 {
    public static int trap(int[] height){
        int[] dp = new int[height.length];
        int max = 0, res = 0;
        for(int i = 0; i < height.length; i++){
            dp[i] = max;
            max = Math.max(max, height[i]);
        }
        max = 0;
        for (int i = height.length-1; i>=0; i--){
            dp[i] = Math.min(dp[i],max);
            max = Math.max(max, height[i]);
            if (dp[i] > height[i]){
                res += dp[i] - height[i];
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
