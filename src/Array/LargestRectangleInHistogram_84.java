package Array;

import java.util.Stack;

public class LargestRectangleInHistogram_84 {
    public static int largestRectangleArea(int[] heights){
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

    public static void main(String[] args){
        int [] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
}

