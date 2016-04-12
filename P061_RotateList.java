/*
    https://leetcode.com/problems/rotate-list/

    Given a list, rotate the list to the right by k places, where k is 
    non-negative.

    For example:
    Given 1->2->3->4->5->NULL and k = 2,
    return 4->5->1->2->3->NULL.

    @tags: Linked List, Two Pointers
*/

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
