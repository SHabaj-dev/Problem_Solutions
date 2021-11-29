package LinkList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        SinglylinkList ss = new SinglylinkList();
        int choice, val;

        do{

            System.out.println("Singly Link List Operations Menu.");
            System.out.println("Press 1 to Display the elemnts of the Singly Link List. ");
            System.out.println("Press 2 for Insertion At end of the Singly Link List.");
            System.out.println("Press 3 for Insertion at begning of the Singly Link List.");
            System.out.println("press 4 to print the length of the Singly Link List.");

            System.out.println("Press 0 to Exit.");
            
            
            System.out.println("Please Enter Your Choice : ");
            choice = sc.nextInt();

            switch(choice){

                case 0:
                    System.exit(0);
                    break;
                
                case 1:
                    ss.display();
                    break;

                case 2:
                    System.out.println("Please Enter the Data to insert at the end of The Singly Link List.");
                    val = sc.nextInt();
                    ss.insertLast(val);
                    break;

                case 3:
                    System.out.println("Please Enter the Data to insert at the begning of the Singly Link List.");
                    val = sc.nextInt();
                    ss.inserFirst(val);
                    break;

                case 4:
                    System.out.println("The Size of the Singly Link List is " + ss.lengthLinkList());
                    break;
                
                default:
                    System.out.println("Wrong Input! Please Try Again.");

            }

        }while(true);

    }
}
