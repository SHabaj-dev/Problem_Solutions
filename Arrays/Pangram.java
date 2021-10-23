/*
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters,
 return true if sentence is a pangram, or false otherwise.
*/

package Arrays;

import java.util.*;

public class Pangram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        boolean pangram = isPangram(str);
        System.out.println(pangram);
    }

    public static boolean isPangram(String str) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < alphabets.length(); i++) {
            if (str.indexOf(alphabets.charAt(i)) == -1) {
                return false;
            }
        }

        return true;
    }
}