package Stacks;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        arrayStackOperations();

    }

    public static void arrayStackOperations(){

        System.out.println("Enter the Size of the Stack.");
        int size = sc.nextInt();

        StacksUsingLL stack = new StacksUsingLL(); 

        do {
            System.out.println("Please Select A operation to perform");
            System.out.println("Press 1 to push.");
            System.out.println("Press 2 to pop");
            System.out.println("Press 3 to peek");
            System.out.println("Press 4 to display.");
            System.out.println("Press 0 to Exit");

            System.out.println("Please enter your Choice : ");
            int choice =sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Please enter the data.");
                    int data = sc.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();;
                    break;            
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Input!.");
                    break;
            }
            
        } while (true);
    }
    
}
