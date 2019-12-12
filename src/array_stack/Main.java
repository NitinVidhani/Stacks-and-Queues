package array_stack;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of the stack");
        int size = scan.nextInt();
        ArrayStack stack = new ArrayStack(size);
        int i=1,choice;
        while(i==1)
        {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            choice = scan.nextInt();
            switch(choice)
            {
                case 1:
                    int data = scan.nextInt();
                    stack.push(data);
                    System.out.println("Pushed Successfully");
                    break;
                case 2:
                    System.out.println("Popped element: "+stack.pop());
                    break;
                case 3:
                    System.out.println("Element on top: "+stack.peek());
                    break;
                case 4:
                    stack.display();
                    break;
                default:
                    System.out.println("Invalid input");
            }
            System.out.println("Do you want to continue");
            System.out.println("1. Yes");
            i = scan.nextInt();
        }
    }
}
