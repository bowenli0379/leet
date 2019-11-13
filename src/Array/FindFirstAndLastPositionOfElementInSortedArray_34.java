package Array;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray_34 {
    public static int[] searchRange(int[] nums, int target){
        int [] res = {-1, -1};
        int rightIndex = searchRight(nums, 0, nums.length-1, target);
        if (rightIndex < 0 || nums[rightIndex] != target)
            return res;
        res[0] = searchLeft(nums, 0 ,rightIndex, target);
        res[1] = rightIndex ;
        return res;
    }
    public static int searchRight(int[] nums, int left, int right, int target){
        while (left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] > target)
                right = mid-1;
            else
                left = mid+1;
        }
        return right;
    }
    public static int searchLeft(int[] nums, int left, int right, int target){
        while (left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }
    public static void main(String[] args){
        int [] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
}
