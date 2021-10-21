// Gratest Numbers of Candies (Leet Code Problem)

package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GratestNumbersOfCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int arr[] = new int[m];

        int Extra = sc.nextInt();

        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(kidsWithCandies(arr, Extra));
        sc.close();

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr = new ArrayList<>(candies.length);
        int max = 0;
        
        
        for(int i=0;i<candies.length;i++)
            
                max  = Math.max(max,candies[i]);

         for(int i=0;i<candies.length;i++)
         {
            if(max<=(candies[i]+extraCandies))
                 arr.add(true);
            else
                arr.add(false);
         }
        return arr;
    

    }
}
