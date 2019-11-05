package Array;

public class JumpGameII_45 {
    public static int jump(int[] nums){
        int times = 0;
        int reached = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++){
            if (reached < i){
                times++;
                reached = max;
            }
            max = Math.max(max, nums[i]+i);
        }
        return times;
    }
    public static void main(String[] args){
        int [] nums = {2,3,1,1,4};
        System.out.println(jump(nums));
    }
}
