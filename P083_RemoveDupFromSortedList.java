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
public class P83_RemoveDupFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode newHead = new ListNode(Integer.MAX_VALUE);
        // a helper node
        
        newHead.next = head;
        
        // Two pointers
        ListNode left = newHead;
        ListNode right = newHead.next;
        
        while(right!=null){
            if(right.val!=left.val){
                // if values are not equal, change left
                left.next = right;
                left = left.next;
            }
            right =right.next;
 
        }
        
        // at last, set left.next to right
        left.next = right;
        return newHead.next;
    }
}
