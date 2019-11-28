package Array;

public class JumpGame_55 {
    public static boolean canJump(int[] nums){
        int max = 0;
        for (int i = 0; i < nums.length; i++){
            if (i > max) return false;
            max = Math.max(max, i + nums[i]);
        }
        return true;
    }
    public static void main(String[] args){
        int[] nums1 = {2,3,1,1,4};
        int[] nums2 = {3,2,1,0,4};
        System.out.println(canJump(nums1));
        System.out.println(canJump(nums2));
    }
}
