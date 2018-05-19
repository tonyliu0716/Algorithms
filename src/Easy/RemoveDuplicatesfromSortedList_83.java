package Easy;

/**
 * Created by tao on 5/19/18.
 *
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

 Example 1:

 Input: 1->1->2
 Output: 1->2
 Example 2:

 Input: 1->1->2->3->3
 Output: 1->2->3

 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


public class RemoveDuplicatesfromSortedList_83 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode root = head;
        while(head != null && head.next != null) {
            //System.out.print(head.val + ", ");
            if(head.val == head.next.val) {

                head.next = head.next.next;

            } else {
                head = head.next;
            }
        }

        return root;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);

        root.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        RemoveDuplicatesfromSortedList_83 list = new RemoveDuplicatesfromSortedList_83();
        list.deleteDuplicates(root);
        while(root != null) {
            System.out.print(root.val + ", ");
            root = root.next;
        }
    }

}
