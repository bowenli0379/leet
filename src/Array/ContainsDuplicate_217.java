package Array;

import java.util.Arrays;

public class ContainsDuplicate_217 {
    public static boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++){
            if (nums[i] == nums[i-1])
                return true;
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums1 = {1,2,3,1};
        int[] nums2 = {1,2,3,4};
        System.out.println(containsDuplicate(nums1));
        System.out.println(containsDuplicate(nums2));
    }
}
