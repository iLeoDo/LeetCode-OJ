/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class P002_AddTwoNumbers{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummyHead = new ListNode(Integer.MAX_VALUE);
        ListNode traverse = dummyHead;
        while(l1!=null||l2!=null||carry!=0){
            int v1 = l1==null?0+carry:l1.val+carry;
            int v2 = l2==null?0+v1:l2.val+v1;
            traverse.next = new ListNode(v2%10);
            carry = v2/10;
            traverse = traverse.next;
            l1 = l1==null?null:l1.next;
            l2 = l2==null?null:l2.next;
        }
        return dummyHead.next;
    }
}
