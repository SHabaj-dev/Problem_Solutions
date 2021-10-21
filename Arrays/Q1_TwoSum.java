/*
Given an arrays of integers nums and an integer target,
return indices of the two numbers such tha they add upto target.
*/
package Arrays;

import java.util.Scanner;

public class Q1_TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int index[] = findindex(arr, target);

        for(int i : index){
            System.out.print(i + " ");
        }
        sc.close();
    }

    public static int[] findindex(int[] nums, int target){
        int a[] = new int[2];

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length ; j++){
                if(target == nums[i] + nums[j]){
                    a[0] = i;
                    a[1] = j;
                }
            }
        }

        return a;
    }
}
