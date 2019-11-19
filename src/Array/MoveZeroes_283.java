package Array;

import java.util.Arrays;

public class MoveZeroes_283 {
    public static int[] moveZeroes(int[] nums){
        int i = 0;
        int temp = 0;
        for (int j = 0; j < nums.length; j++){
            if (nums[j] != 0){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
}
