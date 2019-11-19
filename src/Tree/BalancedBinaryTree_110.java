package Tree;

public class BalancedBinaryTree_110 {
    public static boolean isBalanced(TreeNode root){
        if (root == null)
            return true;
        if (depth(root.left)-depth(root.right) <= 1 )
            return true;
        else
            return false;

    }
    public static int depth(TreeNode root){
        int depth = 0;
        if (root == null)
            return 0;
        if (root.left == null || root.right == null)
            return 1;
        else {
            int left = depth((root.left)) + 1;
            int right = depth(root.right) + 1;
            if (left > right)
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

        TreeNode treeNode6 = new TreeNode(1);
        TreeNode treeNode7 = new TreeNode(2);
        TreeNode treeNode8 = new TreeNode(2);
        TreeNode treeNode9 = new TreeNode(3);
        TreeNode treeNode10 = new TreeNode(3);
        TreeNode treeNode11 = new TreeNode(4);
        TreeNode treeNode12 = new TreeNode(4);
        treeNode6.left = treeNode7;
        treeNode6.right = treeNode8;
        treeNode7.left = treeNode9;
        treeNode7.right = treeNode10;
        treeNode9.left = treeNode11;
        treeNode9.right = treeNode12;
        System.out.println(isBalanced(treeNode1));
        System.out.println(isBalanced(treeNode6));

    }
}
