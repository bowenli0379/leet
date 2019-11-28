package Tree;

public class CountCompleteTreeNodes_222 {
    public static int countNodes(TreeNode root) {
        int leftmost = 0;
        TreeNode left = root;
        while (left != null) {
            leftmost ++;
            left = left.left;
        }

        int rightmost = 0;
        TreeNode right = root;
        while (right != null) {
            rightmost ++;
            right = right.right;
        }
        if (leftmost == rightmost) return (1<<leftmost)-1;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    public static void main(String[] args){
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;

        System.out.println(countNodes(treeNode1));
    }
}
