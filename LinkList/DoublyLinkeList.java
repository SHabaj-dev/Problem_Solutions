package LinkList;

import javax.swing.text.Position;

public class DoublyLinkeList {

    Node head;

    public class Node {

        int data;
        Node next;
        Node prev;

        public Node(int val) {

            this.data = val;
        }

        public Node(int val, Node next, Node prev) {

            this.data = val;
            this.next = next;
            this.prev = prev;
        }

    }

    // Function to insert at First in Doubly Linked List.
    public void insertFirst(int val) {

        Node node = new Node(val);

        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }

        head = node;

    }

    // Function to display the Doubly Link List
    public void display() {

        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("Null");
    }

    // Function to Print the Size of the Doubly Linked List.
    public int doublySize() {
        int lenght = 0;
        Node node = head;

        while (node != null) {
            node = node.next;
            lenght++;
        }
        return lenght;
    }

    // Function To search a Specific Data in the Doubly Linked List.
    public int searchData(int val) {
        int Position = 1;
        Node node = head;
        while (node != null) {
            if (node.data == val) {
                return Position;
            }
            Position++;
            node = node.next;
        }
        return 0;

    }

    // Function to insert the Node at the End of the Doubly Linked List.
    public void insertAtLast(int val) {

        Node node = new Node(val);
        Node currNode = head;

        if (currNode == null) {
            head.next = node;
            node.prev = head;
        }

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = node;
        node.prev = currNode;
    }

    // Function To insert At a Given Position in Doubly Linked List.
    public void insertAtPos(int val, int Position) {

        Node node = new Node(val);
        Node currNode = head;

        if (Position == 1) {
            insertFirst(val);
        }

        if (Position == doublySize()) {
            insertAtLast(val);
        }

        int count = 1;

        while (count < Position - 1) {
            currNode = currNode.next;
            count++;
        }

        node.next = currNode.next;
        currNode.next = node;
        node.prev = currNode;
        currNode.next.prev = node;

    }

    //Funtion To delete the last Node of the Doubly Linke List.
    public void deleteLast(){

        Node node = head;
        Node bNode = node;

        while (node.next != null) {
            bNode = node;
            node = node.next;
        }

        bNode.next = null;
    }


    //Function To delete the First Node of in the Doubly Linked List.
    public void deleteFirst(){

        Node node = head;

        head = node.next;
        node.next = null;
        // head.prev = null;


    }

    //Function To delete the Node at a given position.
    public void deleteAtPos(int position){
        
        Node node = head;

        if(position == 1){
            deleteFirst();
        }
        
        if(position == doublySize()){
            deleteLast();
        }

        for(int i = 1; i < position; i++){
                node = node.next;
        }

        Node temp = node.next.next;

        node.next = temp;
        temp.prev = node;
    }

}
