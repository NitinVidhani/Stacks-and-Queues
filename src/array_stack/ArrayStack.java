package array_stack;

import java.util.*;

public class ArrayStack {
    
    private static int top;
    private int array[];
    
    public ArrayStack(int size)
    {
        top = -1;
        array = new int[size];
    }
    
    public void push(int data)
    {
        top++;
        array[top] = data;
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return 0;
        }
        return array[top--];
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return 0;
        }
        return array[top];
    }
    public boolean isEmpty()
    {
        if(top == -1)
            return true;
        return false;
    }
    public void display()
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
    
}
