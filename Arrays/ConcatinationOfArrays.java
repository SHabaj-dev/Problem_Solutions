//Concatination of Array(Leet Code Problem)

package Arrays;

import java.util.Scanner;

public class ConcatinationOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int ans[] = getConcatenation(arr);

        for (int i : ans) {
            System.out.print(i + " ");
        }
        sc.close();

    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;

        System.out.println(n);
        int newArr[] = new int[n * 2];

        for (int i = 0; i < n; i++) {
            newArr[i] = nums[i];
            newArr[i + n] = nums[i];
        }

        return newArr;
    }

}
