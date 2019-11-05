package Array;

public class LIS300 {
    public int lengthOfLIS(int [] nums){
        int[] maxLen = new int[nums.length];
        int res = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < i; j++){
                if (nums[i] > nums[j]){
                    maxLen[i] = Math.max(maxLen[j]+1, maxLen[i]);
                }
            }
            res = Math.max(res, maxLen[i]+1);
        }
        return res;
    }
}
