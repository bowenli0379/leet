package Tree;

public class PopulatingNextRightPointersInEachNode_117 {
    public static Node connect(Node root){
        if (root == null)
            return root;
        Node node = root;
        while (node != null){
            Node level = new Node();
            Node current = level;
            while (node != null){
                if (node.left != null) {
                    current.next = node.left;
                    current = current.next;
                }
                if (node.right != null){
                    current.next = node.right;
                    current = current.next;
                }
                node = node.next;
            }
            node = level.next;
        }
        return root;

    }
}
