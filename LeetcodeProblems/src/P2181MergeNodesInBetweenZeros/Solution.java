package P2181MergeNodesInBetweenZeros;

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

    public static ListNode mergeNodes(ListNode head) {
        
    	if (head.val == 0) head = head.next;
    	
        ListNode result = new ListNode(0);
        ListNode current = result;
        int sum = 0;
        
        while (head != null) {
        	
            if (head.val == 0) {

                current.next = new ListNode(sum);
                current = current.next;
                sum = 0; 
                
            } else {

                sum += head.val;
            }
            
            head = head.next;
        }
        
        return result.next;
    }
    
    public static void main(String[] args) {
    	
    	ListNode head = new ListNode(0,
    					new ListNode(1,
    					new ListNode(0,
    					new ListNode(3,
    					new ListNode(0,
    					new ListNode(2,
    					new ListNode(2,
    					new ListNode(0
    	))))))));
    	
    	ListNode output = Solution.mergeNodes(head);
    	
    	System.out.println(output.next.next.val);
    }
}