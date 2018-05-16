package Easy;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by tao on 5/16/18.
 *
 *
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.

 Example:

 Input: 1->2->4, 1->3->4
 Output: 1->1->2->3->4->4
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class MergeTwoSortedLists_21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 != null) {
            return l2;
        } else if (l1 != null && l2 == null) {
            return l1;
        } else if(l1 == null && l2 == null) {
            return null;
        }
        ArrayList<Integer> numbers = new ArrayList<>();
        while(l1 != null) {
            numbers.add(l1.val);
            l1 = l1.next;
        }
        while(l2 != null) {
            numbers.add(l2.val);
            l2 = l2.next;
        }
        Collections.sort(numbers);

        ListNode root = new ListNode(numbers.get(0));
        ListNode pointer = root;
        for(int i = 1; i < numbers.size(); i++) {
            ListNode next = new ListNode(numbers.get(i));
            root.next = next;
            root = next;
        }

        return pointer;
    }

    public static void main(String[] args) {
        MergeTwoSortedLists_21 list = new MergeTwoSortedLists_21();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);

        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(4);

        l1.next = l2;
        l2.next = l3;

        l4.next = l5;
        l5.next = l6;
        ListNode node = list.mergeTwoLists(l1, l4);
        while(node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

}
