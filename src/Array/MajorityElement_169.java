package Array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {
    public static int majorityElement(int[] nums){
        int count = 0;
        int main = nums[0];

        for (int i = 0; i < nums.length; i ++){
            if (nums[i] == main)
                count++;
            else{
                if (count > 0)
                    count--;
                else
                    main = nums[i];
            }
        }
        return main;
    }
    public static void main(String[] args){
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
