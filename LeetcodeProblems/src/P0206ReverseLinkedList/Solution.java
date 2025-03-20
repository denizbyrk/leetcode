package P0206ReverseLinkedList;

class ListNode {
	
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class Solution {

	public static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode current = head;
        
        while (current != null) {
        	
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        
        return prev;
	}
	
	public static void main(String[] args) {
		
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
		
		ListNode output = Solution.reverseList(head);
		
		System.out.println(output.next.val);
	}
}