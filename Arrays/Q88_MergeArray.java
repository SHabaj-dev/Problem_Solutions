/*
You are given two ineger arrays nums1 and nums2,
sorted in non- decreasing order, and two integers m and n,
representing the numbers of elements in nums1 and nums2 respectively.
*/
package Arrays;

import java.util.*;

public class Q88_MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int arr1[] = new int[m];
        int arr2[] = new int[n];

        arr1 = inputArray(m);
        arr2 = inputArray(n);

        int mergedArray[] = meargArray(arr1, arr2, m , n);
        Arrays.sort(mergedArray);

        for(int i : mergedArray){
            System.out.print(i + " ");
        }
    }

    public static int[] meargArray(int[] arr1, int[] arr2, int m, int n){
        int mergArray[] = new int[m + n];

        for(int i = 0; i < m; i++){
            mergArray[i] = arr1[i];
            mergArray[i + m] = arr2[i];
        }

        return mergArray;
    }

    public static int[] inputArray(int size){
        Scanner sc = new Scanner(System.in);
        int array[] = new int[size];

        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        return array;
    }
}
