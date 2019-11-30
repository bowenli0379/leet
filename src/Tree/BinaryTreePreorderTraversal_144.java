package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal_144 {
    public static List<Integer> res = new ArrayList<>();
    public static List<Integer> preorderTraversal1(TreeNode root){
        preorder(root);
        return res;
    }
    public static List<Integer> preorder(TreeNode root){
        res.add(root.val);
        if (root.left != null)
            preorder(root.left);
        if (root.right != null)
            preorder(root.right);
        return res;
    }

    public static List<Integer> preorderTraversal2(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            if (temp != null){
                res.add(temp.val);
                stack.add(temp.right);
                stack.add(temp.left);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);

        treeNode1.right = treeNode2;
        treeNode2.left = treeNode3;

        System.out.println(preorderTraversal1(treeNode1));
        System.out.println(preorderTraversal2(treeNode1));
    }
}
