package Array;

public class JumpGameII_45 {
    public static int jump1(int[] nums){
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
    public static int jump2(int[] nums){
        int cur = 0, last = 0, res = 0;
        for (int i = 0; i < nums.length-1; i++) {
            cur = Math.max(cur, nums[i] + 1);
            if (last == i) {
                last = cur;
                res++;
            }
            if (cur >= nums.length-1)
                break;

        }
        return res;
    }
    public static void main(String[] args){
        int [] nums = {2,3,1,1,4};
        System.out.println(jump1(nums));
        System.out.println(jump2(nums));
    }
}
