package DP;

public class MaximumProductSubarray_152 {
    public static int maxProduct(int[] nums){
        int max = nums[0], min = nums[0], res = nums[0];
        for (int i = 1; i < nums.length; i++){
            int mx = max, mn = min;
            max = Math.max(Math.max(nums[i], mx * nums[i]), mn * nums[i]);
            min = Math.min(Math.min(nums[i], mx * nums[i]), mn * nums[i]);
            res = Math.max(res, max);
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums1 = {2,3,-2,4};
        int[] nums2 = {-2,0,-1};
        System.out.println(maxProduct(nums1));
        System.out.println(maxProduct(nums2));
    }
}
