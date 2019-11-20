package Tree;

import com.sun.tools.jdi.IntegerValueImpl;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree_98 {
    //也是利用了递归的思想，分别对每一个子树进行判断，但是它的亮点在于在判断的时候并不需要对子树进行搜索“最相近的值”，而是利用了“最大值”、“最小值”的思想：
    //对于每个子树，都有一个最大值和一个最小值，
    //对于左子树，最大值就是它的根节点的值，最小值是根节点的最小值（左父亲或者MIN_VALUE）
    //对于右子树，最小值就是它的根节点的值，最大值是根节点的最大值（右父亲或者MAX_VALUE）
    public static boolean isValidBST1(TreeNode root){
        if (root == null)
            return true;
        return isValid1(root, Long.MIN_VALUE, Long.MAX_VALUE);

    }
    public static boolean isValid1(TreeNode node, long min, long max){
        if (node == null) return true;
        if (node.val < min || node.val > max) return false;
        return isValid1(node.left, min, node.val) && isValid1(node.right, node.val, max);

    }

    //中序遍历
    //通过中序遍历将所有的节点值存到一个数组里，再判断这个数组是不是有序
    public static boolean isValidBST2(TreeNode root){
        List<Integer> list = new ArrayList<>();
        isValid2(root, list);
        for (int i = 0; i < list.size()-1; i++){
            if (list.get(i) >= list.get(i+1))
                return false;
        }
        return true;
    }
    public static void isValid2(TreeNode node, List<Integer> list){
        if (node == null) return;
        isValid2(node.left, list);
        list.add(node.val);
        isValid2(node.right,list);
    }
    public static void main(String[] args){
        TreeNode treeNode1 = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(4);
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(6);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        TreeNode treeNode6 = new TreeNode(2);
        TreeNode treeNode7 = new TreeNode(1);
        TreeNode treeNode8 = new TreeNode(3);
        treeNode6.left = treeNode7;
        treeNode6.right = treeNode8;

        System.out.println(isValidBST1(treeNode1));
        System.out.println(isValidBST1(treeNode6));

        System.out.println(isValidBST2(treeNode1));
        System.out.println(isValidBST2(treeNode6));
    }
}
