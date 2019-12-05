package Array;

import java.util.Arrays;

public class TwoSumII_167 {
    public static int [] twoSum1(int[] numbers, int target){
        int[] res = new int[2];
        int i = 0;
        int j = numbers.length-1;
        while (i < j){
            if (numbers[i] + numbers[j] == target){
                res[0] = i+1;
                res[1] = j+1;
            }
            if (numbers[i] + numbers[j] > target)
                j--;
            else
                i++;
        }
        return res;
    }
    public static int[] twoSum2(int[] nums, int target){
        int n = nums.length;
        int[] res = new int[2];
        int left = 0, right = n - 1;
        while (left < right){
            int sum = nums[left] + nums[right];
            if ( sum == target) {
                res[0] = left + 1;
                res[1] = right + 1;
            }
            if (sum < target)
                left++;
            else
                right--;
        }
        return res;
    }
    public static void main(String[] args){
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum1(numbers, target)));
        System.out.println(Arrays.toString(twoSum2(numbers, target)));
    }
}
