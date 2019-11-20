package Array;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoom_252 {
    public static boolean canAttendMeetings(int[][] intervals){
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0])
                    return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });
        for (int i = 1; i < intervals.length; i++){
            if (intervals[i][0] <= intervals[i-1][1])
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        int[][] intervals1 = {{0,30},{5,10},{15,20}};
        int[][] intervals2 = {{7,10},{2,4}};
        System.out.println(canAttendMeetings(intervals1));
        System.out.println(canAttendMeetings(intervals2));
    }
}
