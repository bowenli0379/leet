package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal_94 {
    public static List<Integer> inorderTraversal1(TreeNode root){
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }
    public static List<Integer> inorder(TreeNode root, List<Integer> res){
        if (root == null)
            return res;
        if (root.left != null)
            inorder(root.left,res);
        res.add(root.val);
        if (root.right != null)
            inorder(root.right,res);
        return res;
    }
    public static List<Integer> inorderTraversal2(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null)
            return res;
        TreeNode node = root;
        while (node != null || !stack.isEmpty()){
            while (node != null){
                stack.push(node);
                node = node.left;
            }
            node = (TreeNode) stack.pop();
            res.add(node.val);
            node = node.right;
        }
        return res;
    }
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);

        treeNode1.right = treeNode2;
        treeNode2.left = treeNode3;

        System.out.println(inorderTraversal1(treeNode1));
        System.out.println(inorderTraversal2(treeNode1));
    }
}
