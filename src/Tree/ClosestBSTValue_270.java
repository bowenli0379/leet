package Tree;

public class ClosestBSTValue_270 {
    public static int closestValue(TreeNode root, double target) {
        int res = root.val;
        while (root != null){
            if (Math.abs(res-target) > Math.abs(root.val-target))
                return root.val;
            if (root.val > target)
                root = root.left;
            else
                root = root.right;
        }
        return res;
    }
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(5);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        double target = 1.714;
        System.out.println(closestValue(treeNode1,target));
    }
}
