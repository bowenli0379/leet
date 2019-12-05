package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_15 {
    public static List<List<Integer>> threeSum1(int[] nums){
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
                    while (l < r && nums[l] == nums[l - 1]) //去重 后状态与前状态比较
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
    public static List<List<Integer>> threeSum2(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        if (nums[0] > 0)
            return res;
        for (int i = 0; i < nums.length; i++){
            if (i > 0 && nums[i] == nums[i-1])
                continue;
            int left = i + 1, right = nums.length-1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    left++;
                    right--;
                    while(left > 0 && nums[left] == nums[left-1])
                        left++;
                    while (right > 0 && nums[right] == nums[right+1])
                        right--;
                }
                else if (sum < 0)
                    left++;
                else
                    right--;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum1(nums));
        System.out.println(threeSum2(nums));
    }
}
