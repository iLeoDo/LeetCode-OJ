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
public class P061_RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next=head;
        ListNode current = dummyHead;
        int len=0;
        while(current.next!=null){
            current = current.next;
            len++;
        }
        current.next = head;//make the list as a circle

        len = len-k%Math.max(1,len); // len=0
        while(len>0){
            current=current.next;
            len--;
        }
        head=current.next;
        current.next=null;
        return head;
    }

}
