package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_15 {
    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 3)  return res;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0) return res;
            if (i > 0 && nums[i] == nums[i-1]) continue; //没写i > 0；
            int l = i + 1;
            int r = nums.length -1 ;
            while (l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    res.add(list);
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) //去重
                        l++;
                    while (l < r && nums[r] == nums[r + 1]) //去重
                        r--;
                }
                else if(sum < 0) // 不满足条件移动指针
                    l++;
                else
                    r--;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}
