/*
    https://leetcode.com/problems/remove-duplicates-from-sorted-list/

    Given a sorted linked list, delete all duplicates such that each element 
    appear only once.

    For example,
    Given 1->1->2, return 1->2.
    Given 1->1->2->3->3, return 1->2->3.

    @tags: Linked List
*/

public class P083_RemoveDuplicatesFromSortedList{
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(Integer.MAX_VALUE);
        ListNode current = head;
        ListNode prev = dummyHead;
        prev.next = current;

        while(current!=null){
            if(current.val==prev.val){
                prev.next = current.next;
            }else{
                prev = current;
            }
            current = current.next;
        }
        return dummyHead.next;

    }
}
