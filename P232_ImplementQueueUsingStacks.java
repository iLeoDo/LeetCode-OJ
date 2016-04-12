/*
    Implement the following operations of a queue using stacks.

    push(x) -- Push element x to the back of queue.
    pop() -- Removes the element from in front of queue.
    peek() -- Get the front element.
    empty() -- Return whether the queue is empty.
    Notes:
    You must use only standard operations of a stack -- which means only push to
     top, peek/pop from top, size, and is empty operations are valid.

    Depending on your language, stack may not be supported natively. You may
    simulate a stack by using a list or deque (double-ended queue), as long as
    you use only standard operations of a stack.

    You may assume that all operations are valid (for example, no pop or peek
    operations will be called on an empty queue).

    @tags Stack, Design
 */
public class P232_ImplementQueueUsingStacks{
    class MyQueue {

        // [ stackIn  =>  <= stackOut ]
        Stack<Integer> stackIn = new Stack();
        Stack<Integer> stackOut = new Stack();

        // Push element x to the back of queue.
        public void push(int x) {
            while(!stackOut.isEmpty()){
                stackIn.push(stackOut.pop());
            }
            stackIn.push(x);
        }

        // Removes the element from in front of queue.
        public void pop() {
            while(!stackIn.isEmpty()){
                stackOut.push(stackIn.pop());
            }
            stackOut.pop();
        }

        // Get the front element.
        public int peek() {
            while(!stackIn.isEmpty()){
                stackOut.push(stackIn.pop());
            }
            return stackOut.peek();
        }

        // Return whether the queue is empty.
        public boolean empty() {
            return stackIn.isEmpty()&&stackOut.isEmpty();
        }
    }
}
