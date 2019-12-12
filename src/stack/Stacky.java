package stack;

import java.util.*;

public class Stacky {
    private Stack stack;
    
    public Stacky()
    {
        stack = new Stack();
    }
    //push onto the stack
    public void push(int data)
    {
        stack.push(data);
    }
    //pop off the stack
    public int pop()
    {
        return (int) stack.pop();
    }
    //returns top of the stack
    public int peek()
    {
        return (int) stack.peek();
    }
    //calculate size of the stack
    public int size()
    {
        return stack.size();
    }
    //Is stack empty or not?
    public boolean isEmpty()
    {
        return stack.isEmpty();
    }
    //Show stack
    public Stack show()
    {
        return stack;
    }
    
}

