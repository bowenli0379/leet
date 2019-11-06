package Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_001 {
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int [] res = new int[2];
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(target-nums[i])) {
                res[0] = map.get(target - nums[i]);
                res[1] = i;
            }
            map.put(nums[i], i);
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(nums,target));

    }

}
