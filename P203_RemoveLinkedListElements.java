
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
