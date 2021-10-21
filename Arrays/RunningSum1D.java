// Runnig Sum Problem(Leet Code Problem)

package Arrays;

import java.util.*;

public class RunningSum1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int ans[] = runningSum(arr);

        for (int i : ans) {
            System.out.print(i + " ");
        }
        sc.close();
    }

    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
            arr[i] = sum;
        }

        return arr;
    }
}
