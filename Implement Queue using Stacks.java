class MyQueue {

    /** Initialize your data structure here. */
    Stack<Integer> s;
    int i;
    List<Integer> l;
    public MyQueue() 
    {
        s=new Stack<>();
        i=0;
        l=new ArrayList<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) 
    {
        s.push(x);
        l.add(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() 
    {
        int k= l.get(i++);
        return k;
    }
    
    /** Get the front element. */
    public int peek() 
    {
        return l.get(i);
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty()
    {
        if(s.size()==i)
        {
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */