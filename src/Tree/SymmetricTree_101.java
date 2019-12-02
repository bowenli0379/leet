package Tree;

public class SymmetricTree_101 {
    public static boolean isSymmetric(TreeNode root){
        if (root == null)
            return true;
        return check(root.left, root.right);
    }
    public static boolean check(TreeNode p, TreeNode q){
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        return (check(p.left, q.right) && check(p.right, q.left));
    }
    public static void main(String[] args){
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(2);
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(4);
        TreeNode treeNode6 = new TreeNode(4);
        TreeNode treeNode7 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        TreeNode treeNode8 = new TreeNode(1);
        TreeNode treeNode9 = new TreeNode(2);
        TreeNode treeNode10 = new TreeNode(2);
        TreeNode treeNode11 = new TreeNode(3);
        TreeNode treeNode12 = new TreeNode(3);
        treeNode8.left = treeNode9;
        treeNode8.right = treeNode10;
        treeNode9.right = treeNode11;
        treeNode10.right = treeNode12;
        System.out.println(isSymmetric(treeNode1));
        System.out.println(isSymmetric(treeNode8));
    }
}
