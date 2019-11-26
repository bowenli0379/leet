package Array;

public class SingleNumber_136 {
    public static int singleNumber (int[] nums){
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums1 = {4, 1, 2, 1, 2};
        int[] nums2 = {2,2,1};
        System.out.println(singleNumber(nums1));
        System.out.println(singleNumber(nums2));
    }
}
