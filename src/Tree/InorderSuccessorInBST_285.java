package Tree;

public class InorderSuccessorInBST_285 {
    public static TreeNode inorderSuccessor1(TreeNode root, TreeNode p){
        TreeNode res = null;
        while (root != null){
            if (root.val > p.val){
                res = root;
                root = root.left;
            }
            else
                root = root.right;
        }
        return res;
    }

    public static void main(String[] args){
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode2.left = treeNode1;
        treeNode2.right = treeNode3;

        TreeNode p = new TreeNode(2);
        System.out.println(inorderSuccessor1(treeNode2,p).val);
    }
}

