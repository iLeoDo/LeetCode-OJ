/*
    https://leetcode.com/problems/reverse-linked-list/

    Reverse a singly linked list.

    Hint:
    A linked list can be reversed either iteratively or recursively. Could you 
    implement both?

    @tags: Linked List
*/

public class P206_ReverseLinkedList{
    public ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode newHead=null;
        while(current!=null){
            ListNode next = current.next;
            current.next = newHead;
            newHead = current;
            current = next;
        }
        return newHead;
    }
}
