package Tree;

import java.util.ArrayList;
import java.util.List;

public class PathSumII_113 {
    public static List<List<Integer>> pathSum(TreeNode root, int sum){
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return res;
        helper(root, sum, list, res);
        return res;
    }
    public static void helper(TreeNode node, int sum, List<Integer> list, List<List<Integer>> res){
        if (node != null) {
            if (node.left == null && node.right == null && node.val == sum) {
                list.add(node.val);
                res.add(new ArrayList<>(list));
                list.remove(list.size()-1);
                return;
            }
            list.add(node.val);
            helper(node.left, sum - node.val, list, res);
            helper(node.right, sum - node.val, list, res);
            list.remove(list.size() - 1);
        }
    }
    public static void main(String[] args){
        TreeNode treeNode1 = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(4);
        TreeNode treeNode3 = new TreeNode(8);
        TreeNode treeNode4 = new TreeNode(11);
        TreeNode treeNode5 = new TreeNode(13);
        TreeNode treeNode6 = new TreeNode(4);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(2);
        TreeNode treeNode9 = new TreeNode(5);
        TreeNode treeNode10 = new TreeNode(1);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode3.left = treeNode5;
        treeNode3.right = treeNode6;
        treeNode4.left = treeNode7;
        treeNode4.right = treeNode8;
        treeNode6.left = treeNode9;
        treeNode6.right = treeNode10;
        int sum = 22;

        System.out.println(pathSum(treeNode1, 22));
    }
}
