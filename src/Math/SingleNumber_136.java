package Math;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber_136 {
    public static int singleNumber1(int[] nums){
        int res = 0;
        for (int num : nums){
            res = res ^ num;
        }
        return res;
    }
    public static int singleNumber2(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            if (map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
        }
        int i = 0;
        while (i < nums.length){
            if (map.get(nums[i]) == 1)
                break;
            i++;
        }
        return nums[i];
    }
    public static void main(String[] args){
        int[] nums1 = {2,2,1};
        int[] nums2 = {4,1,2,1,2};
        System.out.println(singleNumber1(nums1));
        System.out.println(singleNumber1(nums2));
        System.out.println(singleNumber2(nums1));
        System.out.println(singleNumber2(nums2));

    }
}
