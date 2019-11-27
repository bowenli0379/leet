package Array;

import java.util.Arrays;

public class SortColors_75 {
    public static int[] sortColors(int[] nums){
        int left = 0, right = nums.length-1;
        for (int i = 0; i < right; i++){
            if (nums[i] == 0){
                change(nums, i ,left);
                left++;
            }
            if (nums[i] == 2){
                change(nums, i, right);
                i--;
                right--;
            }
        }
        return nums;
    }
    public static void change(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public static void main(String[] args){
        int[] nums = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(sortColors(nums)));
    }
}
