package Tree;

import java.util.Stack;

public class VerifyPreorderSequenceInBinarySearchTree_255 {
    public static boolean verifyPreorder(int[] preorder){
        Stack<Integer> stack = new Stack<>();
        int low = Integer.MIN_VALUE;
        for (int i : preorder){
            if (low > i)
                return false;
            while (!stack.isEmpty() && i > stack.peek()){
                low = stack.pop();
            }
            stack.push(i);
        }
        return true;
    }
    public static void main(String[] args){
        int[] nums1 = {5,2,1,3,6};
        int[] nums2 = {5,2,6,1,3};
        System.out.println(verifyPreorder(nums1));
        System.out.println(verifyPreorder(nums2));
    }
}
