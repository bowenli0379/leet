package Array;

public class FindMinimumInRotatedSortedArray_153 {
    public static int findMin(int[] nums){
        int left = 0, right = nums.length-1, mid = 0;
        while (left <= right){ //和右边比较是因为mid大于right，则一定在右边，mid小于right，一定在可能包含自身的左边；
            mid = (left + right) / 2;
            if (nums[mid] < nums[right])
                right = mid; //可能是比较的自身，所以不+1
            else
                left = mid + 1; //大于的话一定在右边，所以+1；
        }
        return nums[right];
    }
    public static void main(String[] args){
        int [] nums = {4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
    }
}

// 当while（left < right), return left 或者 right；
//当while left <= right， return right；
