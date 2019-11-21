package Array;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII_229 {
    public static List<Integer> majorityElement(int[] nums){
        List<Integer> res = new ArrayList<>();
        int m1 = nums[0];
        int m2 = 0;

        int c1 = 1;
        int c2 = 0;

        for (int i = 0; i < nums.length; i++){
            //1. 相同的相加
            if (nums[i] == m1)
                c1++;
            if (nums[i] == m2)
                c2++;
            // count==0， 证明不是众数，则重新统计
            else if (c1 == 0){
                m1 = nums[i];
                c1 = 1;
            }
            else if (c2 == 0){
                m2 = nums[i];
                c2 = 1;
            }
            //2、不同的相减
            else{
                c1--;
                c2--;
            }
        }
        //找到众数是谁后，从新统计数量 并按要求返回
        c1 = 0; c2 = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == m1)
                c1++;
            if (nums[i] == m2)
                c2++;
        }
        if (c1 > nums.length / 3) res.add(m1);
        if (c2 > nums.length / 3) res.add(m2);
        return res;
    }
    public static void main(String[] args){
        int[] nums = {1,1,1,3,3,2,2,2};
        System.out.println(majorityElement(nums));
    }
}
