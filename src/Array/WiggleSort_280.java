package Array;

import java.util.Arrays;

public class WiggleSort_280 {
    public static int[] wiggleSort(int[] nums){
        if (nums == null)
            return null;
        for (int i = 1; i < nums.length; i++){
            if ((i % 2 == 0 && nums[i] > nums[i-1]) || (i % 2 == 1 && nums[i] < nums[i-1])){
                int temp = nums[i];
                nums[i] = nums[i-1];
                nums[i-1] = temp;
            }
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {3,5,2,1,6,4};
        System.out.println(Arrays.toString(wiggleSort(nums)));
    }
}
