package Array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence_128 {
    public static int longestConsecutive1(int[] nums){
        if (nums == null || nums.length == 0) return 0;
        Set<Integer> set = new HashSet<Integer>();
        int max = 0;

        for (int num : nums)
            set.add(num);
        for (int num : nums){
            if (set.remove(num)){
                int pre = num-1, next = num+1;
                while (set.remove(pre)) --pre;
                while (set.remove(next)) ++next;
                max = Math.max(max, next-pre-1);
            }
        }
        return max;
    }
    public static int longestConsecutive2(int[] nums){
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for (int i : nums)
            set.add(i);
        for (int i : nums){
            if (set.remove(i)) {
                int pre = i - 1, next = i + 1;
                while (set.remove(pre)) pre--;
                while (set.remove(next)) next++;
                if (next - pre -1 > max)
                    max = next - pre - 1;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive1(nums));
        System.out.println(longestConsecutive2(nums));
    }
}
