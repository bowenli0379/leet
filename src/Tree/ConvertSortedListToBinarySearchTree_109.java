package Tree;

public class ConvertSortedListToBinarySearchTree_109 {
    public TreeNode sortedListToBST(ListNode head){
        if (head == null)
            return null;
        //链表区间前闭后开
        TreeNode root = toBST(head, null);
        return root;
    }
    //start和end是前闭后开
    public TreeNode toBST(ListNode start, ListNode end){
        if (start == end)
            return null;
        ListNode mid = getMid(start, end);
        TreeNode root = new TreeNode(mid.val);
        root.left = toBST(start, mid);
        root.right = toBST(mid.next, end);
        return root;
    }
    //求链表的中点
    public ListNode getMid(ListNode start, ListNode end){
        ListNode slow = start;
        ListNode fast = start;

        while (slow != end && fast != end){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
