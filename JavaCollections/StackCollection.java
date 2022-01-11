package JavaCollections;

import java.util.Stack;

public class StackCollection {

    public static void main(String[] args) {
        
        Stack<String> name = new Stack<>();

        name.push("Shabaj.");
        name.push("Asif.");
        name.push("Irshad.");
        name.push("Nadiya.");
        name.push("Saijal and Rachit");
        name.push("Sakshi.");
        name.push("Sahil.");
        name.push("Piyush");

        System.out.println("Stack : " + name);

        System.out.println("Peek : " + name.peek());
        System.out.println("Poped item is " + name.pop());

        
    }
    
}
