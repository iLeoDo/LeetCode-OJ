
public class P160_IntersectionOfTwoLinkedList{
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = length(headA);
        int lenB = length(headB);
        ListNode longN=headB; ListNode shortN = headA;
        if(lenA>lenB){
            longN=headA;
            shortN=headB;
        }
        for(int i=0;i<Math.abs(lenA-lenB);i++){
            longN = longN.next;
        }
        
        while(longN!=null){
            if(longN==shortN){
                return longN;
            }
            
            longN=longN.next;
            shortN =shortN.next;
        }
        return null;
    }
    
    public int length(ListNode head){
        int length=0;
        while(head!=null){
            length++;
            head = head.next;
        }
        return length;
    }
}
