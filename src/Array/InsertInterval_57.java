package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval_57 {
    public static int[][] insert(int[][] intervals, int[] newInterval){
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++){
            if (intervals[i][1] < newInterval[0])
                res.add(intervals[i]);
            else if (intervals[i][0] > newInterval[1]) {
                res.add(newInterval);
                newInterval = intervals[i];
            }
            else if (intervals[i][1] >= newInterval[0] || intervals[i][0] <= newInterval[0]) {
                int[] n = new int[2];
                n[0] = Math.min(intervals[i][0], newInterval[0]);
                n[1] = Math.max(intervals[i][1], newInterval[1]);
                newInterval = n;
            }
        }
        res.add(newInterval);
        int[][] result = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++)
            result[i] = res.get(i);
        return result;
    }
    public static void main(String[] args){
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,9};
        for (int i = 0; i < (insert(intervals, newInterval)).length; i++)
            System.out.println(Arrays.toString(insert(intervals, newInterval)[i]));
    }
}
