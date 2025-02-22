package P0083RemoveDuplicatesFromSortedList;

public class Solution {
	
	public static class ListNode {
		
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
	
	public static ListNode deleteDuplicates(ListNode head) {
        
		if (head == null) return null;
		
    	 ListNode current = head;
         ListNode next = current.next;
         
         while (null != next) {
        	 
             if (current.val == next.val) {
            	 
                 current.next = next.next;
             } else {
            	 
                 current = next;
             }
             
             next = current.next;
         }
         
         return head;
    }
	
	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        System.out.println("Original List:");
        
        ListNode current = head;
        while (current != null) {
        	
            System.out.print(current.val + " -> ");
            current = current.next;
        }

        head = Solution.deleteDuplicates(head);

        System.out.println("\nNew List: ");
        
        ListNode current1 = head;
        while (current1 != null) {
        	
            System.out.print(current1.val + " -> ");
            current1 = current1.next;
        }
	}
}