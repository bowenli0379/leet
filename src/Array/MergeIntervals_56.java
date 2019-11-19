package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals_56 {
    public static List<List<Integer>> merge(int[][] intervals){
        int n = intervals.length;
        List<Integer> starts = new ArrayList<>() ;
        List<Integer> ends = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++){
            starts.add(intervals[i][0]);
            ends.add(intervals[i][1]);
        }
        for (int i = 0, j = 0; i < n; i++){
            if (i == n-1 || starts.get(i+1) > ends.get(j)){
                List<Integer> list = new ArrayList<>();
                list.add(starts.get(j));
                list.add(ends.get(i));
                res.add(list);
                j = i+1;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(merge(intervals));
    }
}
