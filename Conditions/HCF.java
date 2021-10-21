//Program to Find the HCF of the Two Numbers.
package Conditions;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.println("Enter the First Number : ");
        num1 = sc.nextInt();

        System.out.println("Enter the Second Number : ");
        num2 = sc.nextInt();

        int hcf = 0;

        int temp = (num1 > num2)?num1 : num2;

        for(int i = 1; i <= temp; i++){
            if((num1 % i == 0) && (num2 % i == 0)){
                hcf = i;
            }
        }

        System.out.printf("The HCf of the %d and %d is %d ", num1, num2, hcf);
        sc.close();
    }
    
}
