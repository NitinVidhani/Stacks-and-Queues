package queue;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Queuey myQueue = new Queuey();
        Scanner scan = new Scanner(System.in);
        int i=1,choice;
        while(i==1)
        {
            System.out.println("***Welcome to my Queue");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Size");
            System.out.println("4. Display");
            choice = scan.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter data you want to insert");
                    int data = scan.nextInt();
                    myQueue.enqueue(data);
                    System.out.println("Data inserted successfully");
                    break;
                case 2:
                    System.out.println("The data removed is : "+myQueue.dequeue());
                    break;
                case 3:
                    System.out.println("The total elements in the queue are : "+myQueue.size());
                    break;
                case 4:
                    myQueue.display();
                    break;
                default:
                    System.out.println("Invalid input");
                    
            }
            System.out.println("Do you want to continue");
            System.out.println("Press 1 for yes and any other for no");
            i = scan.nextInt();
        }
    }
}
