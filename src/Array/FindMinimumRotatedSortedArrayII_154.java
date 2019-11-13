package Array;

public class FindMinimumRotatedSortedArrayII_154 {
    public static int findMin(int[] nums){
        int left = 0, right = nums.length -1 , mid = 0;
        while (left <= right){
            mid = (left + right) / 2;
            if (nums[mid] < nums[right])
                right = mid;
            else if (nums[mid] > nums[right])
                left = mid+1;
            else right--;
        }
        return nums[left];
    }
    public static void main(String[] args){
        int[] nums = {2,2,2,0,1};
        System.out.println(findMin(nums));
    }
}

// 当while（left < right), return left 或者 right；
//当while left <= right， return left；