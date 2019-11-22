package Tree;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal_105 {
    public static TreeNode buildTree(int[] preorder, int[] inorder){
        TreeNode root = buildBinaryTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
        return root;
    }
    public static TreeNode buildBinaryTree(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn){
        if (startPre > endPre || startIn > endIn)
            return null;
        TreeNode root = new TreeNode(pre[startPre]);

        for (int i = startIn; i <= endIn; i++){
            if (in[i] == pre[startPre]){
                root.left = buildBinaryTree(pre, startPre+1, startPre+i-startIn, in, startIn, i-1);
                root.right = buildBinaryTree(pre, startPre+i-startIn+1, endPre, in, i+1, endIn);
            }
        }
        return root;
    }
    public static void main(String[] args){
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        System.out.println(buildTree(preorder, inorder));
    }
}
