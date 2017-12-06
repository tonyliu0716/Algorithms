package Medium;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by tonyliu on 2017/12/4.
 *
 *
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Example

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 Explanation: 342 + 465 = 807.
 *
 */





//  Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }

public class AddTwoNumbers2 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        long num = covertListToInt(l1) + covertListToInt(l2);
        String numString = reserveString(num + "");
        System.out.println("numString value is " + numString);
        ListNode lnode = new ListNode(Integer.parseInt(numString.charAt(0) + ""));
        ListNode lnode1 = lnode;
        if(numString.length() == 1) {
            return lnode;
        }
        int count = 0;
        while(lnode != null && count < numString.length() - 1) {
            count ++;
            //System.out.println("The node val is " + numString.charAt(count));
            lnode.next = new ListNode(Integer.parseInt(numString.charAt(count) + ""));

            lnode = lnode.next;
        }

        return lnode1;
    }

    public static Long covertListToInt(ListNode listNode) {
        StringBuffer sb = new StringBuffer();
        while(listNode != null) {
            sb.append(listNode.val);
            listNode = listNode.next;
        }

        System.out.println(Integer.valueOf(reserveString(sb.toString())));
        return Long.valueOf(reserveString(sb.toString()));
    }

    public static String reserveString(String str) {
        StringBuffer strings = new StringBuffer();
        for(int i = str.length() - 1; i >= 0; i--) {
            strings.append(str.charAt(i));
        }
        return strings.toString();
    }



    // another one   !!! Much more easise:
    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {

        ListNode listNode = new ListNode(0);
        ListNode pointer = listNode;
        int addOne = 0;
        int val1 = 0;
        int val2 = 0;

        while(l1 != null || l2 != null || addOne != 0) {

            if(l1 != null) {
                val1 = l1.val;
            }
            if(l2 != null) {
                val2 = l2.val;
            }
            int listVal = val1 + val2 + addOne;

            // 判断这个产生的val 是否大于10
            if(listVal >= 10) {
                addOne = 1;
                listNode.val = listVal - 10;
            } else {
                addOne = 0;
                listNode.val = listVal;
            }

            if(l1 != null) {
                l1 = (l1.next != null ? l1.next : null);
            }
            if(l2 != null) {
                l2 = (l2.next != null ? l2.next : null);
            }


            if(l1 == null && l2 == null && addOne == 0) {
               break;
            }

            listNode.next = new ListNode(0);
            listNode = listNode.next;

            val1 = 0;
            val2 = 0;
        }

        return pointer;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(8);



        listNode1.next = listNode2;



        ListNode listNode4 = new ListNode(0);


        ListNode l = AddTwoNumbers2.addTwoNumbers1(listNode1, listNode4);

        while(l != null) {
            System.out.println(l.val);
            l = l.next;
        }


    }

}
