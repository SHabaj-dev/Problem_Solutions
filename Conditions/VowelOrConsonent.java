//Program to Check wheater the charater is Vowel or Consonent.

package Conditions;

import java.util.Scanner;

public class VowelOrConsonent {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Character : ");
        char ch = sc.next().trim().charAt(0);

        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                || ch == 'u' || ch == 'U') {
            System.out.println("The Charater you Enterd is Vowel ");
        } else {
            System.out.println("The Charater you Enterd is a Consonent");
        }
    }
}