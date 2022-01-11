package Stacks;

 public class StacksUsingLL{

    Node head;
    Node tail;

    public class Node{
        int data;
        Node next;


        public Node(int data){
            this.data = data;
        }

    }

    //Function to Insert inside of the Stack.
    public void push(int data){

        Node node = new Node(data);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

    }

    //Functio to display the Stack.
    public void display(){
        Node node = head;

        while (node != null) {
            System.out.print(node.data + " ");
            System.out.println();
            node = node.next;

        }
    }


    //Function to peak Stack.
    public void peek(){
        System.out.print(tail.data + " ");
        System.out.println();
    }

    //Function to pop elements From the Stack.
    public void pop(){

        Node node = head;
        Node temp = node;

        System.out.println("poped : " + node.data);

        temp = head.next;
        head = temp;
    }

}