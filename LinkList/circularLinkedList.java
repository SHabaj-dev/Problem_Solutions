package LinkList;

public class circularLinkedList {

    private Node head;
    private Node tail;

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

    }

    // Function to add data in Circular Linked List.
    public void insert(int data) {

        Node node = new Node(data);

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;

    }

    // Function to Display the Circular Linked List.
    public void display() {

        Node node = head;

        if (head != null) {
            do {
                System.out.print(node.data + " -> ");
                node = node.next;

            } while (node != head);
        }
    }

    //Function to find the length of the Circular Linked List.
    public int length(){
        int length = 0;
        Node node = head;

        if(head != null){
            do{
                length++;
                node = node.next;

            }while(node != head);
        }
        return length;
    }

    //Funtion to insert data a  given position in the Circular Linked List.
    public void insertAtpos(int data, int pos){
        Node node = head;
        Node temp = node;
        Node newNode = new Node(data);
        int i = 0;

        if(pos == 1){
            insert(data);
        }

        if(pos == length()){
            insert(data);
        }

        if(head != null){
            do{
                temp = node;
                node = node.next;
                i++;

            }while(i < pos);
        }

        temp.next = newNode;
        newNode.next = node;


    }

    //Function to delete First or Last Node From the Circular Linked List.
    public void deleteFirstOrLast(){
        Node node = head;
        Node temp = node;

        do{
            temp = node;
            node = node.next;
        }while(node.next != head);

        temp.next = head;
        System.out.println(node.data + " is Deleted From the List");
    }

    //Functio To delete the Node at The Given position.
    public void deleteAtPos(int pos){
        Node node = head;
        Node temp = node;
        int i = 0;

        do {
            i++;
            temp = node;
            node = node.next;
            // System.out.println("positon " + i + " Data " + node.data);
            
        } while (i < pos - 1);

        System.out.println("data -> " + node.data);
        temp.next = node.next;

    }

    //Function to search the data in the circular Linked List.
    public void search(int data){

        Node node = head;
        int count = 0;

        if(head != null){
            do {
            
                if(node.data == data){
                    System.out.println("Found at the position " + count + 1);
                    return;
                }
                
                node = node.next;
                    count++;
            
            } while (node != head);
        }

        System.out.println("Not Found!");
        return;
        

    } 

}
