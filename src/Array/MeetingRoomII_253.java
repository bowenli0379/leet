package Array;

import java.util.Map;
import java.util.TreeMap;

public class MeetingRoomII_253 {
    public static int minMeetingRooms(int[][] intervals){
        Map<Integer, Integer> map = new TreeMap<>();
        for (int[] interval : intervals){
            int count = map.getOrDefault(interval[0],0);
            map.put(interval[0], count + 1);
            count = map.getOrDefault(interval[1], 0);
            map.put(interval[1], count -1);
        }
        int res = 0, count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            count += entry.getValue();
            res = Math.max(res, count);
        }
        return res;
    }
    public static void main(String[] args){
        int[][] intervals1 = {{0,30},{5,10},{15,20}};
        int[][] intervals2 = {{7,10},{2,4}};
        System.out.println(minMeetingRooms(intervals1));
        System.out.println(minMeetingRooms(intervals2));
    }
}
