package Tree;

public class BinaryTreeMaximumPathSum_124 {
    public static int maxPathSum(TreeNode root){
        // if(root == null) return 0;
        int[] res = new int[1];
        res[0] = Integer.MIN_VALUE;

        findMaxSum(root,res);
        return res[0];
    }

    private static int findMaxSum(TreeNode node,int[] res){
        if(node == null)
            return 0;

        int left = findMaxSum(node.left,res);
        int right = findMaxSum(node.right,res);

        int ans = Math.max(node.val,Math.max(left+node.val,right+node.val));//记录从当前点经过能得到的最大值

        res[0] = Math.max(res[0],Math.max(ans,left+right+node.val));//先比较从当前点向能得到的最大值和以该点左右子树能得到的最大值，然后和原来的最大值比较

        return ans;
    }
    public static void main(String[] args){
        TreeNode treeNode1 = new TreeNode(-10);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
        System.out.println(maxPathSum(treeNode1));
    }
}
