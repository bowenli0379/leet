package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreePaths_257 {
    public static List<String> binaryTreepaths(TreeNode root){
        List<String> res = new ArrayList<>();
        if(root == null)
            return res;
        binaryTreepathsDFS(root, "", res);
        return res;
    }
    public static List<String> binaryTreepathsDFS(TreeNode node, String str, List<String> res){
        if (node.left == null && node.right == null)
            res.add(str + String.valueOf(node.val));
        if (node.left != null)
            binaryTreepathsDFS(node.left, str + String.valueOf(node.val) + "->", res);
        if (node.right != null)
            binaryTreepathsDFS(node.right, str + String.valueOf(node.val) + "->", res);
        return res;

    }
    public static void main(String[] args){
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(5);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.right = treeNode4;
        System.out.println(binaryTreepaths(treeNode1));
    }
}
