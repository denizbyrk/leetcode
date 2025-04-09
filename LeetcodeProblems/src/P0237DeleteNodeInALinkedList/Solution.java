package P0237DeleteNodeInALinkedList;

class ListNode {
	
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {

    public static void deleteNode(ListNode node) {
        if (node == null || node.next == null) return;

        node.val = node.next.val;
        node.next = node.next.next;
    }
    
    public static void main(String[] args) {
    	
    	ListNode head = new ListNode(4);
    	head.next = new ListNode(5);
    	head.next.next = new ListNode(1);
    	head.next.next.next = new ListNode(9);
    	
    	Solution.deleteNode(head.next);
    	
    	System.out.println(head.next.val);
    }
}
