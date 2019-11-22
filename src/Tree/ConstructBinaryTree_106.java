package Tree;

public class ConstructBinaryTree_106 {
    public static TreeNode buildTree(int[] inorder, int[] postorder){
        TreeNode root = buildBinaryTree(inorder, 0, inorder.length-1, postorder, postorder.length-1);
        return root;
    }
    public static TreeNode buildBinaryTree(int[] in, int startIn, int endIn, int[] post, int endPost){
        if (startIn > endIn)
            return null;
        TreeNode root = new TreeNode(post[endPost]);
        for (int i = endIn; i>= 0; i--){
            if (in[i] == post[endPost]){
                root.left = buildBinaryTree(in, startIn,i-1, post, endPost-(endIn-i)-1);
                root.right = buildBinaryTree(in, i+1, endIn, post, endPost-1);
            }
        }
        return root;
    }
    public static void main(String[] args){
        int[] inorder = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};
        System.out.println(buildTree(inorder, postorder));
    }
}
