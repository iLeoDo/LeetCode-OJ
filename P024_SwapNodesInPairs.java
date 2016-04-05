
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
