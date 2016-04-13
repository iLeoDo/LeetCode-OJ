/*
    https://leetcode.com/problems/min-stack/

    Design a stack that supports push, pop, top, and retrieving the minimum 
    element in constant time.

    push(x) -- Push element x onto stack.
    pop() -- Removes the element on top of the stack.
    top() -- Get the top element.
    getMin() -- Retrieve the minimum element in the stack.

    @tags: Stack, Design
*/

public class P155_MinStack{
	Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();
    
    public P155_MinStack(){
        minStack.push(Integer.MAX_VALUE);
    }
    
    public void push(int x) {
        stack.push(x);
        if(x<=minStack.peek())
            minStack.push(x);
    }

    public void pop() {
        int c = stack.pop();
        if(minStack.peek()==c)
            minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
