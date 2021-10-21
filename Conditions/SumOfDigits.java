//Program To print the Sum of the Digits.

package Conditions;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        int sum = 0;

        while(num != 0){
            sum = sum +(num % 10);
            num /= 10;
        }

        System.out.println("Sum of Digits of the given number is " + sum);
        sc.close();
    }
    
}
