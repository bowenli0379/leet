package Tree;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal_103 {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = false;
        while (!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int n = queue.size();
            for (int i = 0; i < n; i++){
                TreeNode node = queue.peek();
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
                level.add(queue.poll().val);
            }

            if (flag) Collections.reverse(level);
            flag = !flag;
            if(!level.isEmpty()) res.add(level);
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

        for (int i = 0; i < zigzagLevelOrder(treeNode1).size(); i++){
            System.out.println(zigzagLevelOrder(treeNode1).get(i));
        }
    }
}
