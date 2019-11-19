package Tree;

public class MaximumDepthOfBinaryTree_104 {
    public static int maxDepth(TreeNode root){
        int depth = 0;
        if (root == null)
            return 0;
        else if (root.left == null || root.right == null)
            return 1;
        else{
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            if (left > right)
                depth = left + 1;
            else
                depth = right + 1;
        }
        return depth;
    }
    public static void main(String[] args){
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
        System.out.println(maxDepth(treeNode1));
    }
}
