/*
program to check wheather the given Number is palendrom or not.
Exg : 121 is a palendrom but -121 is not a palendrom.
*/
package Basics;

import java.util.Scanner;

public class Q9_Palendrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        

        System.out.println(isPalendrom(num));
        sc.close();
    }

    public static boolean isPalendrom(int num) {
        int rev = 0;
        int copy = num;

        if(num < 0){
            return false;
        }

        while(num != 0) {
            rev = (rev * 10) + (num % 10);
            num /= 10;
        }

        return ((rev == copy)?true : false);
    }
    
}
