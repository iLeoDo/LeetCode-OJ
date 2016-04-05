
public class P206_ReverseLinkedList{
    public ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode newHead=null;
        while(current!=null){
            ListNode next = current.next;
            current.next = newHead;
            newHead = current;
            current = next;
        }
        return newHead;
    }
}
