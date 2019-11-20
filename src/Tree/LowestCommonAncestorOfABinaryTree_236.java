package Tree;

public class LowestCommonAncestorOfABinaryTree_236 {
    public static int lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if ((Integer) root.val == null || root.val == p.val || root.val == q.val )
            return root.val;
        int left = lowestCommonAncestor(root.left, p, q);
        int right = lowestCommonAncestor(root.right, p, q);

        if ((Integer)left != null && (Integer)right != null)
            return root.val;
        if ((Integer)left == null)
            return right;
        else
            return left;
    }
    public static void main(String[] args){
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(1);
        TreeNode treeNode4 = new TreeNode(6);
        TreeNode treeNode5 = new TreeNode(2);
        TreeNode treeNode6 = new TreeNode(0);
        TreeNode treeNode7 = new TreeNode(8);
        TreeNode treeNode8 = new TreeNode(7);
        TreeNode treeNode9 = new TreeNode(4);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;
        treeNode5.left = treeNode8;
        treeNode5.right = treeNode9;
        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(1);
        System.out.println(lowestCommonAncestor(treeNode1,p,q));
    }
}
