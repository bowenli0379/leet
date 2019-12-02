package Array;

public class LongestIncreasingSubsequence_300 {
    public static int lengthOfLIS(int[] nums){
        int res = 0;
        int[] maxLen = new int[nums.length];
        if (nums == null || nums.length == 0)
            return res;
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < i; j++){ //到i为止，前面有几个数比nums[i]小
                if (nums[i] > nums[j])
                    maxLen[i] = Math.max(maxLen[j]+1, maxLen[i]);
            }
            res = Math.max(res, maxLen[i]+1);
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }
}
