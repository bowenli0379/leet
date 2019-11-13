package Array;

public class SearchInRotatedSortedArrayII_81 {
    public static boolean search(int[] nums, int target){
        int left = 0, right = nums.length-1, mid = 0;
        while (left <= right){
            mid = (left + right) / 2;
            if (nums[mid] == target)
                return true;
            if (nums[left] < nums[mid]){// 和right比较也行，最后条件是right--；
                if (nums[left] <= target && target < nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            else if (nums[left] > nums[mid]){
                if (nums[mid] < target && target <= nums[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            else
                left++; // 相比于33，将相等的条件单独写，相等就移动指针；
        }
        return false;
    }
    public static void main(String[] args){
        int [] nums = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));
    }
}
