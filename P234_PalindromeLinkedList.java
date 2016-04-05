
public class P234_PalindromeLinkedList{
    public boolean isPalindrome(ListNode head) {

        if(head==null){
            return true;
        }
        ListNode newHeader = head;
        ListNode current = head.next;
        ListNode fast = head;
        while(fast.next!=null&&fast.next.next!=null){
            fast = fast.next.next;
            // moving
            // reverse
            ListNode next = current.next;
            current.next = newHeader;
            newHeader = current;
            current=next;
        }

        // a->b->c->d->null
        // a->b->c->null
        if(fast.next==null){
            //odd
            newHeader = newHeader.next;
        }
        while(current!=null){
            if(current.val!=newHeader.val){
                return false;
            }
            current = current.next;
            newHeader = newHeader.next;
        }
        return true;

    }
}
