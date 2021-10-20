/*
Given an array numbs of integers,
return how many of them contains an Even Digits.
*/
package Arrays;

import java.util.Scanner;

public class FindNumbersWithEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int arr[] = new int[size];

        int count_even_digits = evenDigits(arr);

        System.out.println(count_even_digits);
    }

    public static int evenDigits(int[] nums) {
        int even_digits = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int temp = nums[i];
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }

            if (count % 2 == 0) {
                even_digits++;
            }
        }

        return even_digits;
    }

}
