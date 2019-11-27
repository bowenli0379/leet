package Tree;

public class KthSmallestElementInABST_230 {
    public static int count, res;
    public static int kthSmallest(TreeNode root, int k){
        if (root.left != null)
            return kthSmallest(root.left, k);
        if (++count == k)
            res = root.val;
        if (root.right != null)
            return kthSmallest(root.right, k);
        return res;
    }
    public static void main(String[] args){
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(2);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.right = treeNode4;
        int k = 1;

        System.out.println(kthSmallest(treeNode1, k));
    }
}
