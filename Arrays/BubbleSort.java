/*
Program To demonstrate  Bubble Sort.
*/

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        bubblesort(arr);

        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    public static void bubblesort(int[] arr) {
        int len = arr.length - 1;

        for (int i = 0; i < len; i++) {

            for (int j = 0; j < len - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
