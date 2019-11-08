package Array;

public class MinimumSizeSubarraySum_209 {
    public static int minSubArray(int s, int[] nums){
        if (nums == null || nums.length == 0)
            return 0;
        int i = 0, sum = 0, minLen = Integer.MAX_VALUE;
        for (int j = 0; j < nums.length; j++){
            sum += nums[j];
            while (sum >= s){
                minLen = Math.min(minLen, j-i+1);
                sum -= nums[i];
                i++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
    public static void main(String[] args){
        int[] nums = {2,3,1,2,4,3};
        int s = 7;
        System.out.println(minSubArray(s, nums));
    }
}
