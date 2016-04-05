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
