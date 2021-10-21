/*
Program to perform binary search in an array if we don't Know Whether the array is sorted in ascending order or descending order
 */

package Arrays;

import java.util.*;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        int ans = 0;

        if (arr[0] < arr[arr.length - 1]) {
            ans = binarySearchinAcnd(arr, target);
        }

        if (arr[0] > arr[arr.length - 1]) {
            ans = binarySearchinDecn(arr, target);
        }

        System.out.println(ans);

        sc.close();
    }

    public static int binarySearchinAcnd(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < a[mid]) {
                end = mid - 1;
            } else if (target > a[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }

        return -1;
    }

    public static int binarySearchinDecn(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > a[mid]) {
                end = mid - 1;
            } else if (target < a[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;

    }
}
