package Arrays;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, arr.length - 1);
    }

    public static void mergeSort(int[] arr, int l , int r){

        if(l < r){
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }

    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int i = l;
        int j = mid;
        int k = l;
        int b[] = new int[arr.length];

        while(i <= mid && j <=r){

            if( arr[i] > arr[j]){
                b[k] = arr[j];
                j++;
            }
            if(arr[i] < arr[j]){
                b[k] = arr[i];
                i++;
            }
            k++;
        }

        if(i > mid) {
            while(j <= r){
                b[k] = arr[j];
                k++;
                j++;
            }
        }else {
            while(i <= mid){
                b[k] = arr[i];
                i++;
                k++;
            }
        }

        for(k = l; k < arr.length; k++){
            arr[k] = b[k];
        }

        System.out.println("Soted Array is : ");

        for (int a: arr) {
            System.out.print(a + " ");

        }


    }

}
