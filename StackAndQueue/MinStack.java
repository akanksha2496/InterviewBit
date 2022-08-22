Min Stack

Bookmark
Medium
33.6% Success

244

82
Asked In:
Yahoo
Amazon
Adobe
more
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) – Push element x onto stack.
pop() – Removes the element on top of the stack.
top() – Get the top element.
getMin() – Retrieve the minimum element in the stack.
Note that all the operations have to be constant time operations.

Questions to ask the interviewer :

Q: What should getMin() do on empty stack? 
A: In this case, return -1.

Q: What should pop do on empty stack? 
A: In this case, nothing. 

Q: What should top() do on empty stack?
A: In this case, return -1
NOTE : If you are using your own declared global variables, make sure to clear them out in the constructor.

code:
class Solution {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minStack=new Stack<>();
    public void push(int x) {
        stack.push(x);
        if(minStack.isEmpty() || minStack.peek()>=x)
        minStack.push(x);
    }

    public void pop() {
        if(!stack.isEmpty())
        {
            int del=stack.pop();
            if(!minStack.isEmpty() && del==minStack.peek())
            minStack.pop();
        }
    }

    public int top() {
        if(!stack.isEmpty())
        return stack.peek();
        return -1;
    }

    public int getMin() {
        if(!minStack.isEmpty())
        return minStack.peek();
        return -1;
    }
}
