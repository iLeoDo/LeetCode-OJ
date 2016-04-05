
public class P019_RemoveNthNodeFromEndOfList{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode left = dummyHead;
        ListNode right = dummyHead;
        while(n>0){
            right = right.next;
            n--;
        }
        while(right.next!=null){
            right = right.next;
            left = left.next;
        }
        left.next = left.next.next;
        return dummyHead.next;
    }
}
