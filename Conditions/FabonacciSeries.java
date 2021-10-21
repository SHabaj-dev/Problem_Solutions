//Program to print the the fabonacci series upto n.

package Conditions;

import java.util.Scanner;

public class FabonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value Of n : ");
        int n = sc.nextInt();

        int z = 0;
        int o = 1;
        int sum = 0;

        System.out.print(z + " " + o + " ");
        for(int i = 3; i <= n; i++){
            sum = z + o;
            z = o;
            o = sum;
            System.out.print(sum + " ");
        }
        sc.close();

    }
}