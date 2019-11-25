package Tree;

public class ConvertSortedArrayToBinarySearchTree_108 {
    public static TreeNode sortedArrayToBST(int[] nums){
        TreeNode root = toBST(nums, 0, nums.length-1);
        return root;
    }
    public static TreeNode toBST(int[] nums, int start, int end){
        if (start > end)
            return null;
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = toBST(nums, start, mid-1);
        root.right = toBST(nums, mid + 1, end);
        return root;
    }
}
