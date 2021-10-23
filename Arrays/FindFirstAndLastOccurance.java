package Arrays;

import java.util.Scanner;

public class FindFirstAndLastOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int ans[] = findfirstandlast(arr, target);

        for (int i : ans) {
            System.out.println(i + " ");
        }
        sc.close();
    }

    public static int[] findfirstandlast(int arr[], int target) {
        int start = search(arr, target, true);
        int end = search(arr, target, false);
        int a[] = { -1, -1 };

        a[0] = start;
        a[1] = end;

        return a;
    }

    public static int search(int arr[], int target, boolean searchfirst) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (searchfirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
