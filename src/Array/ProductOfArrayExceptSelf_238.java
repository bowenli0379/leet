package Array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf_238 {
    public static int[] productExceptSelf(int[] nums){
        int[] res = new int[nums.length];
        res[nums.length-1] = 1;
        for (int i = nums.length-2; i >= 0; i--){
            res[i] = nums[i+1] * res[i+1];
        }
        int left = 1;
        for (int i = 0; i < nums.length; i ++){
            res[i] *= left;
            left *= nums[i];
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
