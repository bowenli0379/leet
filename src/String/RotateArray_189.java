package String;

import java.util.Arrays;

public class RotateArray_189 {
    public static int[] rotate(int[] nums, int k){
        k = k % nums.length; //k也可能大于nums的长度
        reverse(nums, 0, nums.length-k-1);
        reverse(nums, nums.length-k,nums.length-1);
        reverse(nums, 0, nums.length-1);
        return nums;
    }
    public static void reverse(int[] nums, int start, int end){
        for (int i = start, j = end; i < j; i++, j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(rotate(nums,k)));
    }
}
