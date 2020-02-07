package Easy;

/**
 * Created by tonyliu on 2020/2/6.
 */
public class ConvertBinaryNubmerInALinkedListToInteger1290 {

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x) {val = x;}
    }

    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while(head.next != null) {
            sb.append(head.val);
            head = head.next;
        }
        sb.append(head.val);

        return Integer.parseInt(sb.toString(), 2);
    }

}
