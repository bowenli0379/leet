package Array;

public class ContainerWithMostWater_11 {
    public static int maxArea(int[] height){
        if (height == null || height.length == 0)
            return 0;
        int left = 0, right = height.length-1;
        int res = Integer.MIN_VALUE;
        int area = 0;
        while (left < right){
            area = Math.min(height[left],height[right]) * (right-left);
            res = Math.max(res, area);
            if (height[left] <= height[right])
                left++;
            else
                right--;
        }
        return res;
    }
    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
