//Program to find the LCM of two given numbers.
package Conditions;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, min, lcm = 0;

        System.out.println("Enter the First Number : ");
        num1 = sc.nextInt();

        System.out.println("Enter the Second Number : ");
        num2 = sc.nextInt();

        min = (num1 > num2)?num1 : num2;

        for(int i = 1; i <= min; i++){
            if(i % num1 == 0 && i % num2 == 0){
                lcm = i;
                break;
            }
        }

        System.out.format("LCM of the %d and %d is %d", num1, num2, lcm);
        sc.close();
    }
}
