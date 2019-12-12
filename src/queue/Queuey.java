package queue;

import java.util.*;

public class Queuey {
    
    private LinkedList queue;
    
    public Queuey()
    {
        queue = new LinkedList();
    }
    //Insert element in the queue
    public void enqueue(int data)
    {
        queue.addLast(data);
    }
    //Delete element from the queue
    public int dequeue()
    {
        return (int) queue.removeFirst();
    }
    //To know the size of the queue
    public int size()
    {
        return queue.size();
    }
    //To display all the elements of the queue
    public void display()
    {
        System.out.println(queue);
    }
    //
    public boolean isEmpty()
    {
        return queue.isEmpty();
    }
    
}
