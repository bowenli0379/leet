package Array;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII_219 {
    public static boolean containsNearbyDuplicate(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k)
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
        int[] nums2 = {1,2,3,1,2,3};
        int k1 = 3;
        int k2 = 2;
        System.out.println(containsNearbyDuplicate(nums1,k1));
        System.out.println(containsNearbyDuplicate(nums2,k2));
    }
}
