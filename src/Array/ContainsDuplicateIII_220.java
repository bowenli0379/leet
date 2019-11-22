package Array;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateIII_220 {
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                if (i-map.get(nums[i]) <= k && nums[i] - nums[map.get(nums[i])] <= t)
                    return true;
                else
                    map.put(nums[i], i);
            }
            else
                map.put(nums[i],i);
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums1 = {1,2,3,1};
        int k1 = 3;
        int t1 = 0;

        int[] nums2 = {1,5,9,1,5,9};
        int k2 = 2;
        int t2 = 3;

        System.out.println(containsNearbyAlmostDuplicate(nums1, k1, t1));
        System.out.println(containsNearbyAlmostDuplicate(nums2, k2, t2));
    }
}
