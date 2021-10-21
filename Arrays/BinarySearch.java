// Program to perform a Binary Search.
package Arrays;

import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int ans = binarySearch(arr, target);

        System.out.println(ans);
        sc.close();

    }

    public static int binarySearch(int[] a, int target) {
        int start = 0;
        int end = (a.length - 1);

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

}
