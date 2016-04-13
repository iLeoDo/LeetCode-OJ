/*
    https://leetcode.com/problems/remove-linked-list-elements/

    Remove all elements from a linked list of integers that have value val.

    Example
    Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
    Return: 1 --> 2 --> 3 --> 4 --> 5

    @tags: Linked List
*/

public class P203_RemoveLinkedListElements{
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode current = head;
        ListNode prev = dummyHead;
        while(current!=null){
            if(current.val==val){
                prev.next = current.next;
            }else{
                prev = current;
            }
            current = prev.next;
        }
        return dummyHead.next;
    }
}
