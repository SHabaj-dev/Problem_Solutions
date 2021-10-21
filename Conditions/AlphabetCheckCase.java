package Conditions;

import java.util.Scanner;

public class AlphabetCheckCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Charater of your choice : ");
        char ch = sc.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("The Character is in lower case.");
        }

        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("The Charater is in Upper case.");
        }
        sc.close();
    }
    
}
