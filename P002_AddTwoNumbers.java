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
        ListNode dummyHead = new ListNode(0);
        ListNode traversal = dummyHead;
        int carry = 0;
        while(l1!=null||l2!=null||carry!=0){
            int result = (l1==null ? 0 : l1.val)+(l2==null ? 0 : l2.val)+carry;
            l1 = (l1 == null) ? null : l1.next;
            l2 = (l2 == null) ? null : l2.next;
            traversal.next = new ListNode(result%10);
            carry = result/10;
            traversal = traversal.next;
        }
        return dummyHead.next;
    }
}
