package String;

import java.util.Scanner;

/**
 * NumToString
 */
public class NumToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String output = "";

        for(int i = 0; i < num.length(); i++){
        
            output = output + charaterConversion(num.charAt(i)) + " ";
        }

        System.out.println(output);
        sc.close();
    }

    public static String charaterConversion(char digit){

        switch (digit) {
            case '0':
                return "Zero";
            
            case '1':
                return "One";

            case '2':
                return "Two";

            case '3':
                return "Three";

            case '4':
                return "Four";

            case '5':
                return "Five";

            case '6':
                return "Six";

            case '7':
                return "Seven";

            case '8':
                return "Eight";

            case '9':
                return "Nine";

            default:
                return null;
        }
    }
}