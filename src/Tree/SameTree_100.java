package Tree;

public class SameTree_100 {
    public static boolean isSameTree(TreeNode p, TreeNode q){
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.val != q.val)
            return false;
        return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
    }
    public static void main(String[] args){
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(2);
        TreeNode treeNode6 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode4.left = treeNode5;
        treeNode4.right = treeNode6;

        TreeNode treeNode7 = new TreeNode(1);
        TreeNode treeNode8 = new TreeNode(2);
        TreeNode treeNode9 = new TreeNode(1);
        TreeNode treeNode10 = new TreeNode(2);
        treeNode7.left = treeNode8;
        treeNode9.right = treeNode10;

        System.out.println(isSameTree(treeNode1,treeNode4));
        System.out.println(isSameTree(treeNode7,treeNode9));
    }
}
