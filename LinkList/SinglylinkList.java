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

        public Node(int data) {

            this.data = data;

        }

        public Node(int data, Node next) {

            this.data = data;
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
        Node node = new Node(val);
        Node curreNode = head;

        if(head == null){
            head = node;
        }else{
            while(curreNode.next != null){
                curreNode = curreNode.next;
            }
            curreNode.next = node;
        }


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

    ///Function to Delete the last Node of the singly Link List.

}
