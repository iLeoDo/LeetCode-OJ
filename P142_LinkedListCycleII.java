/*
    https://leetcode.com/problems/linked-list-cycle-ii/

    Given a linked list, return the node where the cycle begins. If there is no 
    cycle, return null.

    Note: Do not modify the linked list.

    Follow up:
    Can you solve it without using extra space?

    @tags: Linked List, Two Pointers
*/

public class P142_LinkedListCycleII{
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                flag = true;
                break;
            }
        }
        if(flag==false){
            return null;
        }
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }
}
