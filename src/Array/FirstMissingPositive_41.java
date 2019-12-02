package Array;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

public class FirstMissingPositive_41 {
    public static int firstMissingPositive(int[] nums){
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i]-1] != nums[i]){
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
                i--;
            }
        }
        for (int i = 0 ; i < nums.length; i++){
            if (nums[i] != i+1)
                return i + 1;
        }
        return nums.length + 1;
    }
    public static void main(String[] args){
        int[] nums1 = {1,2,0};
        int[] nums2 = {3,4,-1,1};
        int[] nums3 = {7,8,9,11,12};
        System.out.println(firstMissingPositive(nums1));
        System.out.println(firstMissingPositive(nums2));
        System.out.println(firstMissingPositive(nums3));
    }
}
