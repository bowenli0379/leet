package Tree;

public class ClosestBinarySearchTreeValue_270 {
    public static int cloestValue(TreeNode root, int target) {
        int min = root.val;
        if (Math.abs(min - target) >= Math.abs(root.val - target))
            min = root.val;

        if (root.val > target)
            root = root.left;
        else if (root.val < target)
            root = root.right;
        else
            return root.val;
        return min;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(8);
        TreeNode treeNode4 = new TreeNode(6);
        TreeNode treeNode5 = new TreeNode(9);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        int target = 4;

        System.out.println(cloestValue(treeNode1,target));
    }
}
