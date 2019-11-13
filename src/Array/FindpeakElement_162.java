package Array;

public class FindpeakElement_162 {
    public static int findPeakElement(int[] nums){
        int left = 0, right = nums.length-1, mid = 0;
        while (left < right){
            mid = (left + right) / 2;
            if (nums[mid] < nums[mid+1])
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
    public static void main(String[] args){
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }
}
