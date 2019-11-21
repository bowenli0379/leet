package Tree;

public class PathSum_112 {
    public static boolean hasPathSum1(TreeNode root, int sum){
        if (root == null)
            return false;
        if (root.val == sum && root.left == null && root.right == null)
            return true;
        return (hasPathSum1(root.left,sum-root.val) || hasPathSum1(root.right, sum-root.val));
    }
    public static void main(String[] args){
        TreeNode treeNode1 = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(4);
        TreeNode treeNode3 = new TreeNode(8);
        TreeNode treeNode4 = new TreeNode(11);
        TreeNode treeNode5 = new TreeNode(13);
        TreeNode treeNode6 = new TreeNode(4);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(2);
        TreeNode treeNode9 = new TreeNode(1);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode3.left = treeNode5;
        treeNode3.right = treeNode6;
        treeNode4.left = treeNode7;
        treeNode4.right = treeNode8;
        treeNode6.right = treeNode9;
        int sum = 22;
        System.out.println(hasPathSum1(treeNode1,sum));


    }
}
