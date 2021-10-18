/*
Build Array from Permutation(LeetCode Problem)
*/

package Arrays;

import java.util.Scanner;

public class ArrayFromPermutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int newArr[] = buildArray(arr);

        for (int i : newArr) {
            System.out.print(i + " ");
        }

    }

    public static int[] buildArray(int[] nums) {
        int newArr[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            newArr[i] = nums[nums[i]];
        }

        return newArr;
    }
}