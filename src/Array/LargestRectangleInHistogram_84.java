package Array;

import java.util.LinkedList;
import java.util.Stack;

public class LargestRectangleInHistogram_84 {
    public static int largestRectangleArea1(int[] heights){
        if (heights == null) return 0;
        if (heights.length == 0) return 0;

        Stack<Integer> index = new Stack<Integer>();
        index.push(-1);
        int max = 0;

        for (int i = 0; i < heights.length; i++){
            while(index.peek() > -1)
                if (heights[index.peek()] > heights[i]){
                    int top = index.pop();
                    max = Math.max(max, heights[top]*(i-1-index.peek()));
                }else break;

            index.push(i);
            }
        while (index.peek() != -1){
            int top = index.pop();
            max = Math.max(max, heights[top]*(heights.length-1-index.peek()));
        }
    return max;
    }
    public static int largestRectangleArea2(int[] nums){// 12/02
        Stack<Integer> stack = new Stack<>();
        int res = 0, len = 0;
        for (int i = 0; i < nums.length; i++){
            if ( stack.isEmpty() || nums[i] >= nums[stack.peek()]){
                stack.push(i);
            }
            else{
                int temp = stack.pop();
                if (stack.isEmpty())
                    len = i;
                else
                    len = i - 1 - stack.peek();
                res = Math.max(res, nums[temp]*len);
                i--;
            }
        }
        return res;
    }

    public static void main(String[] args){
        int [] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea1(heights));
        System.out.println(largestRectangleArea2(heights));
    }
}

