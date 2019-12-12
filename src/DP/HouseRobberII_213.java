package DP;

public class HouseRobberII_213 {
    public static int rob(int[] nums){
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);
        return Math.max(helper(nums,0, nums.length-1), helper(nums, 1, nums.length));
    }
    public static int helper(int[] nums, int left, int right){
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);
        int[] dp = new int[right];
        dp[left] = nums[left];
        dp[left+1] = Math.max(nums[left], nums[left+1]);
        for (int i = left+2; i < right; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }
       return dp[right-1];
    }
    public static void main(String[] args){
        int[] nums1 = {1,2,3,1};
        int[] nums2 = {2,3,2};
        System.out.println(rob(nums1));
        System.out.println(rob(nums2));

    }
}
