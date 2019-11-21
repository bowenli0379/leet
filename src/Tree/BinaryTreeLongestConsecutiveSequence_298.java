package Tree;

public class BinaryTreeLongestConsecutiveSequence_298 {
   public static int res = 1;
    public static int longestConsecutive(TreeNode root){
        if (root == null)
            return 0;
        longestConsecutiveDFS(root, 1);
        return res;
    }
    public static void longestConsecutiveDFS(TreeNode node, int count){
        if (node.left != null) {
            if (node.left.val - node.val == 1) {
                longestConsecutiveDFS(node.left, count + 1);
                res = Math.max(res, count + 1);
            }
            else
                longestConsecutiveDFS(node.left, 1);
        }

        if (node.right != null ) {
            if (node.right.val - node.val == 1) {
                longestConsecutiveDFS(node.right, count + 1);
                res = Math.max(res, count + 1);
            }
            else
                longestConsecutiveDFS(node.right, 1);
        }
    }
    public static void main(String[] args){
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(2);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        treeNode1.right = treeNode2;
        treeNode2.left = treeNode3;
        treeNode2.right = treeNode4;
        treeNode4.right = treeNode5;
        System.out.println(longestConsecutive(treeNode1));
    }
}
