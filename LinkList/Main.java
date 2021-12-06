package LinkList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int operationChoice;
        do {
            System.out.println("Enter Your Choice to select The Link List");
            System.out.println("Press 0 To Exit");
            System.out.println("Press 1 for Singly Linked List.");
            System.out.println("Press 2 for Doubly Linked List.");
            System.out.println("Press 3  for Circular Linked List.");


            operationChoice = sc.nextInt();
           
        
            switch(operationChoice){
                case 1:
                    SinglyLinkListOperations();
                    break;
            
                case 2:
                    DoublyLinkeListOperations();
                    break; 
                case 3:
                    circularLinkedListOperations();
                    break;
            
                default:
                    System.out.println("Wrong Choice!");
                    break;
        }
            
        } while (true);
    }


    public static void DoublyLinkeListOperations(){

        Scanner sc = new Scanner(System.in);
        DoublyLinkeList dd = new DoublyLinkeList();
        int choice, val, Position;

        dd.insertFirst(10);
        dd.insertFirst(20);
        dd.insertFirst(30);
        dd.insertFirst(40);
        dd.insertFirst(50);
        dd.insertFirst(60);


        do{

            System.out.println("Doubly Linked List menu");
            System.out.println("Press 0 To exit.");
            System.out.println("Press 1 to display the Display the Doubly Linked List.");
            System.out.println("Press 2 to insert a Node at the begnning.");
            System.out.println("Press 3 To Print the length of the Doubly Linked List.");
            System.out.println("Press 4 To Search an Element in the Doubly Linked List");
            System.out.println("Press 5 to Insert Node at the end of the Doubly Linked List.");
            System.out.println("Press 6 to Insert At a given Position.");
            System.out.println("Press 7 to Delete The Last Node of The Doubly Linked List.");
            System.out.println("Press 8 to Delete The First Node of the Doubly Linked List.");
            System.out.println("Press 9 To Delete Node at a Given Position.");

            System.out.println("Enter Your Choice.");
            choice = sc.nextInt();

            switch (choice) {

                case 0:
                    System.exit(0);
                    break;

                case 1:
                    dd.display();
                    break;

                case 2:
                    System.out.println("Enter the Value : ");
                    val = sc.nextInt();
                    dd.insertFirst(val);
                    break;

                case 3:
                    System.out.println("Length of the Given Doubly Liked List is " + dd.doublySize());
                    break;

                
                case 4:
                    System.out.println("Enter the value to search in the Doubly Linked List.");
                    val = sc.nextInt();
                    if(dd.searchData(val) == 0){
                        System.out.println("Not Found!");
                        break;
                    }
                    System.out.println("Found at position " + dd.searchData(val) + " .");
                    break;

                case 5:
                    System.out.println("Please Enter the Data To insert At the End.");
                    val = sc.nextInt();
                    dd.insertAtLast(val);
                    break;

                case 6:
                    System.out.println("Please Enter the Position.");
                    Position = sc.nextInt();
                    System.out.println("Please Enter The Data.");
                    val = sc.nextInt();
                    dd.insertAtPos(val, Position);
                    break;

                case 7:
                    dd.deleteLast();
                    break;

                case 8:
                    dd.deleteFirst();
                    break;

                case 9:
                    System.out.println("Please Enter the Position.");
                    Position = sc.nextInt();
                    dd.deleteAtPos(Position);
                    break;
            
                default:
                    System.out.println("Wrong Input!");
                    break;
            }

        }while(true);

    }





    public static void SinglyLinkListOperations(){
        
        Scanner sc = new Scanner(System.in);
        SinglylinkList ss = new SinglylinkList();
        int choice, val, position;




        do{

            System.out.println("Singly Link List Operations Menu.");
            System.out.println("Press 1 to Display the elemnts of the Singly Link List. ");
            System.out.println("Press 2 for Insertion At end of the Singly Link List.");
            System.out.println("Press 3 for Insertion at begning of the Singly Link List.");
            System.out.println("press 4 to print the length of the Singly Link List.");
            System.out.println("Press 5 To insert a a given Positon");
            System.out.println("Press 6 To Delete The First Node.");
            System.out.println("Press 7 To Delete the Last Node.");
            System.out.println("Press 8 To Delete a Node at a Given Positon.");
            System.out.println("Press 9 To Find a specific key position in the Singly Link List.");

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

                case 5:
                    System.out.println("Enter the position.");
                    position = sc.nextInt();
                    System.out.println("Enter the Data");
                    val = sc.nextInt();
                    ss.insertAtPosition(val, position);
                    break;
                    
                case 6:
                    ss.deleteFirst(); 
                    break; 
                    
                case 7:
                    ss.deleteLast();
                    break;
                    
                case 8:
                    System.out.println("Enter the Position You want to Delete.");
                    position = sc.nextInt();
                    ss.deleteAtPostion(position);
                    break;

                case 9:
                    System.out.println("Please enter the key oyu want to search in the Link List.");
                    int key = sc.nextInt();
                    ss.findKey(key);
                    break;
                
                default:
                    System.out.println("Wrong Input! Please Try Again.");
            }
        }while(true);
    }

    public static void circularLinkedListOperations(){

        Scanner sc = new Scanner(System.in);
        int data;

        circularLinkedList cll = new circularLinkedList();

        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);
        cll.insert(50);
        
        int choice , val, pos;

         do {
            System.out.println("Circular Linked List menu.");
            System.out.println("Press 0 to Exit.");
            System.out.println("Press 1 To insert an Element in the Linked List");
            System.out.println("Press 2 to Print the Linked List");
            System.out.println("Press 3 to Find the length of the Linked List.");
            System.out.println("Press 4 to insert at the Given position.");
            System.out.println("Press 5 to Delete the First Or Last Node in the Circular Linked List.");
            System.out.println("Press 6 to delete at a given positon in the Given Linked List.");
            System.out.println("Press 7 To search Data.");
            System.out.println("Please Enter your choice : ");
            choice = sc.nextInt();
   
            switch (choice){

                case 0: 
                    System.exit(0);
                    break;
                case 1:
                   System.out.println("Please Enter the Data to insert : ");
                   val = sc.nextInt();
                   cll.insert(val);
                   break;
               
                case 2:
                   cll.display();
                   break;
   
                case 3:
                   System.out.println("Lenght of the linked list is " + cll.length());
                   break;
   
                case 4:
                   System.out.println("Plaese Enter the Position.");
                   pos = sc.nextInt();
                   System.out.println("Plese Enter the Data you Want to insert int the Linked List.");
                   val = sc.nextInt();
                   cll.insertAtpos(val, pos);
                   break;

                case 5:
                    cll.deleteFirstOrLast();
                    break;


                case 6:
                    System.out.println("Please Enter the postiont you want to delete in the Linked List.");
                    pos = sc.nextInt();
                    cll.deleteAtPos(pos);
                    break;

                case 7:
                    System.out.println("Enter the Data you want to search in the Doubly Linked List.");
                    val = sc.nextInt();
                    cll.search(val);
                    break;    

   
                   
                default:
                    System.out.println("Wrong Input!");
                    break;
               
               }
             
         } while (true);


    }
}