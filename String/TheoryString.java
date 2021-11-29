package String;

import java.util.Scanner;

public class TheoryString {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        String inp = "";

        for (int i = 0; i < 26; i++) {
            char alphabets = (char) ('a' + i);
            inp += alphabets;

        }

        System.out.println(inp + " ");

    }

}

/*
In this we are creating the the reference to the new strng every time we are adding a charater to it. This
is wasting our memory in very large. To over come this proble we have a special class called string builder class.
*/
