/*
    https://leetcode.com/problems/remove-nth-node-from-end-of-list/

    Given a linked list, remove the nth node from the end of list and return 
    its head.

    For example,

       Given linked list: 1->2->3->4->5, and n = 2.

       After removing the second node from the end, the linked list becomes 
       1->2->3->5.
    
    Note:
    Given n will always be valid.
    Try to do this in one pass.

    @tags: Linked List, Two Pointers
*/
    
public class P019_RemoveNthNodeFromEndOfList{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode left = dummyHead;
        ListNode right = dummyHead;
        while(n>0){
            right = right.next;
            n--;
        }
        while(right.next!=null){
            right = right.next;
            left = left.next;
        }
        left.next = left.next.next;
        return dummyHead.next;
    }
}
