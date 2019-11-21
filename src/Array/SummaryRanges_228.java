package Array;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges_228 {
    public static List<String> summaryRanges(int[] nums){
        List<String> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            int left = nums[i];
            while (i+1 < nums.length && nums[i+1]-nums[i] == 1)
                i++;
            if (left != nums[i])
                res.add(left + "->" + nums[i]);
            else
                res.add(left+"");
        }
        return res;
    }
    public static void main(String[] args){
        int [] nums = {0,2,3,4,6,8,9};
        System.out.println(summaryRanges(nums));
    }
}
