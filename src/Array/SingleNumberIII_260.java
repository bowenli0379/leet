package Array;

import java.util.Arrays;

public class SingleNumberIII_260 {
    public static int[] singleNumber(int[] nums){
        int diff = 0;
        for (int num : nums){
            diff ^= num;
        }
        diff &= -diff;

        int[] res = {0,0};
        for (int num : nums){
            if ((num & diff) == 0)
                res[0] ^= num;
            else
                res[1] ^= num;
        }
       return res;
    }
    public static void main(String[] args){
        int[] nums = {1,2,1,3,2,5};
        System.out.println(Arrays.toString(singleNumber(nums)));

    }
}
