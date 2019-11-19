package Tree;

public class MinimumDepthOfBinaryTree_111 {
    public static int minDepth(TreeNode root) {
        int depth = 0;
        if (root == null)
            return 0;
        if (root.left == null || root.right == null)
            return 1;
        else {
            int left = minDepth(root.left) + 1;
            int right = minDepth(root.right) + 1;
            if (left < right)
                depth = left;
            else
                depth = right;

        }
        return depth;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
        System.out.println(minDepth(treeNode1));

    }
}
