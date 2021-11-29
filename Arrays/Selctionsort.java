package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Selctionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[] = new int[size];

        selctionsort(arr);

        System.out.println(Arrays.toString(arr));
        
        sc.close();
    }

    // public static void swap(int arr[], int first, int second){
    //     int temp = arr[first];
    //     arr[first] = arr[second];
    //     arr[second] = temp;
    // }

    public static void selctionsort(int [] arr){
        int start = 0;
        int end = arr.length - 1;

        for(int i = 0; i < end - 1; i++){
            int min = i;
            for(int j = i + 1; j < end; j++){
                if(arr[j] < arr[min]){
                    min = i;
                }
            }
            
        }
    }
}
