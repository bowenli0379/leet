package Tree;

public class InvertBinaryTree_226 {
    public static TreeNode invertTree(TreeNode root){
        if (root == null)
            return null;
        if (root.left == null && root.right == null)
            return root;
        return exchange(root);
    }
    public static TreeNode exchange(TreeNode node){
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        exchange(node.left);
        exchange(node.right);
       return node;
    }
}
