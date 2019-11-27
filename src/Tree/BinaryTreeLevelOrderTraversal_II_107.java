package Tree;

import java.util.*;

public class BinaryTreeLevelOrderTraversal_II_107 {
    public static List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)
            return res;
        queue.add(root);
        while (!queue.isEmpty()) {
            int num = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                TreeNode node = queue.peek();
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
                level.add(queue.poll().val);
            }
            // 在链表开始处插入
            res.add(0, level);
        }
        return res;
    }
    public static void main(String[] args){
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        for (int i = 0; i < levelOrderBottom(treeNode1).size(); i++){
            System.out.println(levelOrderBottom(treeNode1).get(i));
        }
    }
}
