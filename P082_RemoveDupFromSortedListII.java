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
public class P82_RemoveDupFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode newHead = new ListNode(Integer.MAX_VALUE);
        // a helper node
        
        newHead.next = head;
        ListNode left = newHead;
        ListNode right = newHead.next;
        while(right!=null){
            while(right.next!=null&&right.next.val==right.val){
                //duplicate nodes
                right = right.next;
            }
            
            if(left.next==right){
                // no duplicate node this round
                left = left.next;
            }else{
                // there are duplicate nodes
                left.next = right.next;
            }
            // move right pointer
            right = right.next;
        }
        return newHead.next;
    }
}
