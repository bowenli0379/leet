package Array;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges_163 {
    public static List<String> findMissingRanges(int[] nums, int lower, int upper){
        List<String> res = new ArrayList<>();
        int l = lower;
        int r = 0;
        for (int i = 0; i <= nums.length; i++){
            if (i < nums.length && nums[i] < upper)
                r = nums[i];
            else
                r = upper + 1;
            if (l == r)
                l += 1;
            else if (l < r){
                StringBuilder sb = new StringBuilder();
                if (r-l == 1) {
                    sb.append(l);
                    res.add(sb.toString());
                }
                else{
                    sb.append(l);
                    sb.append("->");
                    sb.append(r-1);
                    res.add(sb.toString());
                }
                l = r + 1;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums = {0,1,3,50,75};
        int lower = 0;
        int upper = 99;
        System.out.println(findMissingRanges(nums,lower,upper));
    }
}
