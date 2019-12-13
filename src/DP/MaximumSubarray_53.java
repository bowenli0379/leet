package DP;

public class MaximumSubarray_53 {
    public static int maxSubArray(int[] nums){
        int[] sum = new int[nums.length];
        int max = 0;
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            sum[i] = Math.max(nums[i], nums[i] + sum[i-1]);
            max = Math.max(max, sum[i]);
        }
        return max;
    }
    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
