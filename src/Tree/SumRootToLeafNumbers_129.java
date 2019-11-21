package Tree;

public class SumRootToLeafNumbers_129 {
    public static int sumNumbers(TreeNode root) {
        if (root == null)
            return 0;
        return sumDFS(root,0);
    }

    public static int sumDFS(TreeNode node, int sum) {
        sum = sum * 10 + node.val;
        if(node.left == null && node.right == null)
            return sum;
        return sumDFS(node.left,sum) + sumDFS(node.right,sum);

}
    public static void main(String[] args){
        TreeNode treeNode1 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(0);
        TreeNode treeNode4 = new TreeNode(5);
        TreeNode treeNode5 = new TreeNode(1);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        System.out.println(sumNumbers(treeNode1));
    }
}
