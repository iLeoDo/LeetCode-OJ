
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
