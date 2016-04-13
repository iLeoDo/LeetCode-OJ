/*
    https://leetcode.com/problems/copy-list-with-random-pointer/

    A linked list is given such that each node contains an additional random 
    pointer which could point to any node in the list or null.

    Return a deep copy of the list.

    @tags: Hash Table, Linked List
*/

public class P138_CopyListWithRandomPointer{
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode iter = head, next;

        // insert the copy after each node;
        while(iter !=null){
            next = iter.next;

            RandomListNode copy = new RandomListNode(iter.label);
            iter.next = copy;
            copy.next = next;

            iter = next;

        }

        // assign random pointers for the copy nodes.
        iter = head;
        while(iter != null){
            if(iter.random!=null){
                iter.next.random = iter.random.next;
            }
            iter = iter.next.next; //even
        }

        //restore original list, extract the copy one.
        iter = head;
        RandomListNode dummyHead = new RandomListNode(0);
        RandomListNode copy, copyIter = dummyHead;

        while(iter !=null){
            next = iter.next.next;

            //copy
            copy = iter.next;
            copyIter.next = copy;
            copyIter = copy;

            //original
            iter.next = next;
            iter = next;
        }

        return dummyHead.next;
    }
}
