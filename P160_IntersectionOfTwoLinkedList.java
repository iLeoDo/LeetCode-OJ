/*
    https://leetcode.com/problems/intersection-of-two-linked-lists/

    Write a program to find the node at which the intersection of two singly 
    linked lists begins.

    For example, the following two linked lists:

    A:          a1 → a2
                       ↘
                         c1 → c2 → c3
                       ↗            
    B:     b1 → b2 → b3
    begin to intersect at node c1.


    Notes:

    If the two linked lists have no intersection at all, return null.
    The linked lists must retain their original structure after the function 
    returns.
    You may assume there are no cycles anywhere in the entire linked structure.
    Your code should preferably run in O(n) time and use only O(1) memory.

    @tags: Linked List
*/

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
