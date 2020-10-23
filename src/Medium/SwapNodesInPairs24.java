package Medium;

/*
Given a linked list, swap every two adjacent nodes and return its head.

You may not modify the values in the list's nodes. Only nodes itself may be changed.

 

Example 1:
Input: head = [1,2,3,4]
Output: [2,1,4,3]

Example 2:
Input: head = []
Output: []

Example 3:
Input: head = [1]
Output: [1]

*/
public class SwapNodesInPairs24 {
    
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        
        ListNode out = head.next;
		ListNode temp = head;
        ListNode prev = null;
        
		while (temp != null) {
			if (temp.next == null) {
				prev.next = temp;
				return out;
			}
			ListNode next = temp.next.next;

			ListNode one = temp;
			ListNode two = temp.next;
			two.next = one;
			if (prev != null) {
				prev.next = two;

			}
			prev = one;

			temp = next;
		}
		prev.next = null;
		return out;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2; n2.next = n3; n3.next = n4;

        ListNode node = new SwapNodesInPairs24().swapPairs(n1);

        while(node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
    
}
