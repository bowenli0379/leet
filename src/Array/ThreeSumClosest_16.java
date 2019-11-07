package Array;

import java.util.Arrays;

public class ThreeSumClosest_16 {
    public static int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int close = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int l = i + 1 ;
            int r = nums.length - 1;
            while (l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == target) return sum;
                if (Math.abs(close-target) > Math.abs(sum - target))
                    close = sum;
                if (sum < target) l++;
                else r--;
            }
        }
        return close;
    }
    public static void main(String[] args){
        int [] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}
