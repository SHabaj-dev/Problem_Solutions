package Arrays;

import java.util.Scanner;

public class ShuffleTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();

        int s_arr[] = shuffle(arr, m);

        for(int i : s_arr){
            System.out.print(i + " ");
        }
        sc.close();
    }

    public static int[] shuffle(int[] nums, int n) {
        int arr[] = new int[nums.length];
        int start = 0;
        for(int i = 0; i < nums.length; i += 2){
            arr[i] = nums[start++];
            arr[i + 1] = nums[n++];
        }

        return arr;
    }
}
