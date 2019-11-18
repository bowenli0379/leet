package Array;

public class FindDuplicateNumber_287 {
    public static int findDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid)
                    count++;
            }

                if (count > mid){
                    right = mid -1;
                }
                else
                    left = mid + 1;

            }
        return left;
    }
    public static void main(String[] args){
        int[] nums1 = {1,3,4,2,2};
        int[] nums2 = {3,1,3,4,2};
        System.out.println(findDuplicate(nums1));
        System.out.println(findDuplicate(nums2));
    }
}
