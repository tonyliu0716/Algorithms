package Medium;

public class RemoveNthNodeFromEndOfList19 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFormEnd(ListNode head, int n) {
        ListNode firstNode = head;
        ListNode secondNode = head;
        
        for(int i = 0;i < n; i++){         
            firstNode = firstNode.next;
        }
        
        if(null != firstNode){
            while(null != firstNode.next){
                firstNode = firstNode.next;
                secondNode = secondNode.next;
            }

            secondNode.next = secondNode.next.next;
        }
        else{
            head = head.next;
        }
        return head;
    }


    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode head = new RemoveNthNodeFromEndOfList19().removeNthFormEnd(node1, 2);
        while(head.next != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
    
}
