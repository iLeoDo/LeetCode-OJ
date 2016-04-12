/*
    https://leetcode.com/problems/swap-nodes-in-pairs/

    Given a linked list, swap every two adjacent nodes and return its head.

    For example,
    Given 1->2->3->4, you should return the list as 2->1->4->3.

    Your algorithm should use only constant space. You may not modify the 
    values in the list, only nodes itself can be changed.

    @tags: Linked List
*/

public class P024_SwapNodesInPairs{
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(Integer.MAX_VALUE);
        dummyHead.next = head;
        ListNode pre = dummyHead;

        while(pre!=null&&pre.next!=null&&pre.next.next!=null){
            ListNode first = pre.next;
            ListNode second = first.next;
            ListNode after = second.next;
            pre.next=second;
            second.next=first;
            first.next=after;
            pre = first;
        }
        return dummyHead.next;
    }
}
