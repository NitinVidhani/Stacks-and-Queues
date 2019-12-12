/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args)
    {
        Stacky myStack = new Stacky();
        Scanner scan = new Scanner(System.in);
        int choice,i=1;
        while(i==1)
        {
            System.out.println("***Welcome to Mystack***");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Size");
            System.out.println("5. Show");
            choice = scan.nextInt();
        
            switch(choice)
            {
                case 1:
                    System.out.println("Enter data");
                    int data = scan.nextInt();
                    myStack.push(data);
                    break;
                case 2:
                    System.out.println("The data deleted is : "+myStack.pop());
                    break;
                case 3:
                    System.out.println("The element on the top of the stack is : "+myStack.peek());
                    break;
                case 4:
                    System.out.println("THe total elements present in the stack are : "+myStack.size());
                    break;
                case 5:
                    System.out.println("The stack is : "+myStack.show());
                    break;
                default:
                    System.out.println(myStack.isEmpty());
            }
            System.out.println("Do you want to continue");
            System.out.println("Press 1 for yes and 2 for no");
            i = scan.nextInt();
        }
        System.out.println("The stack is : "+myStack.show());
    }
}
