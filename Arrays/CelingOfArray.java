/*
Given a sorted array of distinct integers and a target value,
return the index if the target is found.
If not, return the index where it would be if it were inserted in order.
*/

package Arrays;

import java.util.*;

public class CelingOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int ans = celing(arr, target);

        System.out.println(ans);
        sc.close();

    }

    public static int celing(int[] a, int target) {
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

        return start;
    }

}
