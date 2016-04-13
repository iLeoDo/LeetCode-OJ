/*
    https://leetcode.com/problems/palindrome-linked-list/

    Given a singly linked list, determine if it is a palindrome.

    Follow up:
    Could you do it in O(n) time and O(1) space?

    @tags: Linked List, Two Pointers
*/

public class P234_PalindromeLinkedList{
    public boolean isPalindrome(ListNode head) {

        if(head==null){
            return true;
        }
        ListNode newHeader = head;
        ListNode current = head.next;
        ListNode fast = head;
        while(fast.next!=null&&fast.next.next!=null){
            fast = fast.next.next;
            // moving
            // reverse
            ListNode next = current.next;
            current.next = newHeader;
            newHeader = current;
            current=next;
        }

        // a->b->c->d->null
        // a->b->c->null
        if(fast.next==null){
            //odd
            newHeader = newHeader.next;
        }
        while(current!=null){
            if(current.val!=newHeader.val){
                return false;
            }
            current = current.next;
            newHeader = newHeader.next;
        }
        return true;

    }
}
