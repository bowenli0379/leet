package Math;

import java.util.Arrays;

public class SingleNumberII_137 {
    public static int singleNumberII(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++){
            if (nums[i] == nums[i+1])
                i += 2;
            else
                return nums[i];
        }
        return nums[nums.length-1];
    }
    public static void main(String[] args){
        int[] nums1 = {2,2,3,2};
        int[] nums2 = {0,1,0,1,0,1,99};
        System.out.println(singleNumberII(nums1));
        System.out.println(singleNumberII(nums2));
    }
}
