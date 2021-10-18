//Program To check the given number is perfect number or not.

package Conditions;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i < num; i++) {
            int rem = num % i;

            if (rem == 0) {
                sum = sum + i;
            }
        }

        // System.out.println(sum);

        if (sum == num) {
            System.out.println("Entered Number is a Perfect Number.");
        } else {
            System.out.println("Entered Number is Not a Perfect Number.");
        }
    }
}
