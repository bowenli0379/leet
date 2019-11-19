package Tree;

public class CountUnivalueSubtrees_250 {
    static int count = 0;

    public static int countUnivalSubtrees(TreeNode root) {
        if (root == null) return 0;
        isUnival(root);
        return count;
    }

    private static boolean isUnival(TreeNode root) {
        if (root == null) return true;
        if (isUnival(root.left) & isUnival(root.right)) {
            if (root.left != null && root.left.val != root.val) return false;
            if (root.right != null && root.right.val != root.val) return false;
            count++;
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(1);
        TreeNode treeNode4 = new TreeNode(5);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(5);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.right = treeNode6;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        System.out.println(countUnivalSubtrees(treeNode1));

    }
}
