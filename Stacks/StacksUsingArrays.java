package Stacks;

public class StacksUsingArrays {

    private int size;
    private int top = 0;
    private int arr[];

    public StacksUsingArrays(int size){

        this.size = size;
        arr = new int[this.size];
        
    }

    //Function to push into the Stack.
    public void push(int data){
        arr[top] = data;
        top++;
    }

    //Function to pop From the Stack.
    public void pop(){
        System.out.println(arr[top] + " is poped from the Stack.");
        top--;
    }

    //Function to peek the top Element.
    public int peek(){
        return arr[top];
    }

    //Functio to display the Stack Data.
    public void display(){

        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
}
