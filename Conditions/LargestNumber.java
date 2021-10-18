//WAP to print the largest number in the Given three numbers.
package Conditions;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        int max = 0;

        if(num1 > max){
            max = num1;
        }

        if(num2 > max){
            max = num2;
        }

        if(num3 > max){
            max = num3;
        }

        System.out.println(max);
    }
    
}
