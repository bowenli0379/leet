package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal_145 {
    public static List<Integer> postorderTraversal1(TreeNode root){
        List<Integer> res = new ArrayList<>();
        postorder(root, res);
        return res;
    }
    public static List<Integer> postorder(TreeNode root, List<Integer> res){
        if (root == null)
            return res;
        postorder(root.right, res);
        postorder(root.left, res);
        res.add(root.val);
        return res;
    }
    public static List<Integer> postorderTraversal2(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null)
            return res;
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            if (temp != null){
                res.add(0,temp.val);
                stack.add(temp.left);
                stack.add((temp.right));
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

        System.out.println(postorderTraversal1(treeNode1));
        System.out.println(postorderTraversal2(treeNode1));
    }
}
