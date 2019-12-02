package Array;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum_239 {
    public static int[] maxSlidingWindow(int[] nums, int k){
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length-k+1];
        if (nums == null || nums.length == 0)
            return new int[0];
        for (int i = 0; i < nums.length; i++){
            if (!deque.isEmpty() && deque.peekFirst() == i-k)
                deque.poll();
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i])
                deque.removeLast();
            deque.add(i);
            if (i-k+1 >= 0)
                res[i-k+1] = nums[deque.peek()];
        }
       return res;
    }
    public static void main(String[] args){
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }
}
