package Medium;

/**
 * Created by tao on 5/19/18.
 *
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.

 Example 1:

 Input: 1->2->3->3->4->4->5
 Output: 1->2->5
 Example 2:

 Input: 1->1->1->2->3
 Output: 2->3
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class RemoveDuplicatesfromSortedListII_82 {

    // Input: 1->2->3->3->4->4->5
    //Output: 1->2->5

    // Input: 1->1->1->2->3
    //Output: 2->3
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newhead = new ListNode(0);
        ListNode prev=newhead;
        ListNode itr = head;
        while(itr!=null){
            ListNode next=itr.next;
            //if its the last node or current value is not same as next value
            if(next==null||itr.val!=next.val){
                prev.next=itr;
                prev=itr;
                itr=next;
                continue;
            }
            while(next!=null&&itr.val==next.val){ //skip duplicates
                next=next.next;
            }
            itr=next;
        }
        prev.next=itr;//if last nodes were duplicates
        return newhead.next;
    }


    public static void main(String[] args) {

    }

}
