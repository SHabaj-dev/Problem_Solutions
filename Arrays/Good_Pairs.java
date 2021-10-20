/*
Give an array of integers nums,
return the numbers of good pairs.
A pair (i , j) is called good pair if num[i] == num[j] and i < j.
*/

package Arrays;

import java.util.Scanner;

public class Good_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        // Logic for the good pair in the Given array.

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
