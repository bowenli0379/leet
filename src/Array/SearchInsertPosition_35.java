package Array;

public class SearchInsertPosition_35 {
    public static int searchInsert(int[] nums, int target){
        int left = 0, right = nums.length-1, mid = 0;
        while (left <= right){
            mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }
    public static void main(String[] args){
        int [] nums = {1, 3, 5, 6};
        int target1 = 5;
        int target2 = 2;
        int target3 = 7;
        int target4 = 0;
        System.out.println(searchInsert(nums,target1));
        System.out.println(searchInsert(nums,target2));
        System.out.println(searchInsert(nums,target3));
        System.out.println(searchInsert(nums,target4));
    }
}
