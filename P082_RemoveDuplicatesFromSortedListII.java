/*
    https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/

    Given a sorted linked list, delete all nodes that have duplicate numbers, 
    leaving only distinct numbers from the original list.

    For example,
    Given 1->2->3->3->4->4->5, return 1->2->5.
    Given 1->1->1->2->3, return 2->3.

    @tags: Linked List
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
public class P082_RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(Integer.MAX_VALUE);
        ListNode current = head;
        ListNode prev = dummyHead;
        prev.next = current;

        while(current!=null){
            while(current.next != null && current.val==current.next.val){
                current = current.next;
            }
            if(prev.next==current){
                // nothing removed
                prev = current;
            }else{
                // some nodes removed
                prev.next = current.next;
            }
            current = current.next;
        }
        return dummyHead.next;

    }
}
