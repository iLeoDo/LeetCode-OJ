
public class P225_ImplementStackUsingQueues{
    Queue<Integer> queue = new LinkedList();

    // Push element x onto stack.
    public void push(int x) {
        queue.add(x);
    }

    private void shift(){
        int size = queue.size();
        for(int i = 0;i<size-1;i++){
            int ele = queue.poll();
            queue.add(ele);
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        shift();
        queue.poll();
    }


    // Get the top element.
    public int top() {
        shift();
        int ele = queue.poll();
        queue.add(ele);
        return ele;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }
}
