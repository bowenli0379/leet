package Array;

public class ThreeSumSmaller_259 {
    public static int threeSumSmaller(int[] nums, int target){
        if (nums == null || nums.length == 0){
            return 0;
        }
        int res = 0;
        for (int i = 0; i < nums.length-2; i++){
            int l = i + 1;
            int r = nums.length-1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum < target) {
                    res += r - l;
                    l++;
                }
                else
                    r--;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums = {-2, 0, 1, 3};
        int target = 2;
        System.out.println(threeSumSmaller(nums, target));
    }
}
