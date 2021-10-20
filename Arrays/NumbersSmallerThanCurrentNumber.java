/*
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
*/

package Arrays;

import java.util.Scanner;

public class NumbersSmallerThanCurrentNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];
        int count[] = new int[size];
        int k = 0;

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            int target = 0;
            for (int j = 0; j < size; j++) {
                if (arr[i] > arr[j]) {
                    target++;
                    count[k] = target;
                }
            }
            k++;
        }

        for (int i : count) {
            System.out.print(i + " ");
        }
    }
}
