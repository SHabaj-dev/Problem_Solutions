//Program to find the number occurance.
package Conditions;

import java.util.Scanner;

public class NumberOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integr number : ");
        long num = sc.nextLong();

        System.out.println("Enter the Number whose occurance you want to count. ");
        int search = sc.nextInt();
        int count = 0;

        while(num != 0){
            int temp = (int)num % 10;
            
            if(temp == search){
                count++;
            }

            num = num / 10;

        }

        System.out.printf("The occurance of the %d is %d",search, count );


    }
    
}
