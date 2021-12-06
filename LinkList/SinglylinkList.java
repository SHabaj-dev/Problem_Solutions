package LinkList;

import org.w3c.dom.Node;

public class SinglylinkList {

    private Node head;
    private Node tail;
    private int size;

    public SinglylinkList() {
        this.size = 0;
    }

    //This is a Node class which Creates a node for the singly link list.
    public class Node {
        private int data;
        private Node next;

        public Node(int val) {

            this.data = val;

        }

        public Node(int val, Node next) {

            this.data = val;
            this.next = next;

        }

    }

    //Function to Insert element at the first of the singly link list.
    public void inserFirst(int val) {

        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
    }

    //Function to display the singly link list.
    public void display() {
        Node curreNode = head;

        while (curreNode != null) {
            System.out.print(curreNode.data + " --> ");
            curreNode = curreNode.next;

        }
        System.out.println("Null");
    }


    //Function to insert at the last of the singly link list
    public void insertLast(int val){
        
        if(tail == null){
            inserFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;


    }


    //Function To Print the Length of the Link List.
    public int lengthLinkList(){

        Node curreNode = head;

        while(curreNode != null){
            curreNode = curreNode.next;
            size++;
        }

        return size;

    }

    //Function to insert At a given position.
    public void insertAtPosition(int val, int position){
        
        if(position == 1){
            inserFirst(val);
            return;
        }

        if(position == lengthLinkList()){
            insertLast(val);
            return;
        }

        // Node curreNode = head;
        // Node prev;
        // for(int i = 1; i < position; i++){
        //     curreNode = curreNode.next;
        // }
        // Node node = new Node(val, curreNode.next);
        // curreNode.next = node;

        Node node = new Node(val);
        Node temp = head;
        Node curreNode = temp;

        for(int i = 1; i < position; i++){
            curreNode = temp;    
            temp = temp.next;
        }

        curreNode.next = node;
        node.next = temp;

     
    }


    //Function To delete the first node in Singly Link List.
    public void deleteFirst(){
        Node node = head;
        Node tempNode = head;

        if(node == null){
            System.out.println("Empty Link List.");
            return;
        }

        tempNode = head.next;
        head = tempNode;
    }

    //Function To delete The Last Node in Singly Link List.
    public void deleteLast(){
        if(tail == head){
            System.out.println("Empty Link List.");
            return;
        }

        Node curreNode = head;
        Node temp = head;

        while(curreNode.next  != null){
            temp = curreNode;
            // System.out.println(temp.data + " this is temp.");
            curreNode = curreNode.next;
            // System.out.println(curreNode.data + " this is current");

        }

        temp.next = null;

    }

    //Function to delete Node at a given position in singly link list.
    public void deleteAtPostion(int position){

        if(position == 1){
            deleteFirst();
            return;
        }
        if(position == lengthLinkList()){
            deleteLast();
            return;
        }

        Node curreNode = head;
        
        for(int i = 1; i <= position; i++){
           curreNode = curreNode.next;
            
        }

        curreNode.next = curreNode.next.next;

    }

    //Function to find the the specific key in Singly Link List.
    public void findKey(int key){

        Node node = head;
        int position = 1;

        if(head == tail){
            System.out.println("Empty Link List.");
        }

        while(node != null){
            if(node.data == key){
                System.out.println(key + " found at position " + position);
            }
            node = node.next;
            position++;


        }

    }

    

}
