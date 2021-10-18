//Reachest Customer Wealth(Leet Code problem)

package Arrays;

import java.util.*;

public class RichestCustomerWealth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entet the Valuse of m and n respectively : ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int arr[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max_wealth = maximumWealth(arr);

        System.out.println(max_wealth);
    }

    public static int maximumWealth(int[][] accounts) {
        int max_wealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
                if (sum > max_wealth) {
                    max_wealth = sum;
                }
            }
        }

        return max_wealth;
    }
}