/*
Given a characters array letters that is sorted in non-decreasing order and a character target, 
return the smallest character in the array that is larger than target.

Note that the letters wrap around.

For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
*/

package Arrays;

import java.util.Scanner;

public class SMALLESTGraterThanTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char chArray[] = new char[size];

        for (int i = 0; i < size; i++) {
            chArray[i] = sc.next().charAt(0);
        }
        char target = sc.next().charAt(0);
        sc.close();

        char ret = smallestbinarySearch(chArray, target);

        System.out.println(ret);
    }

    public static char smallestbinarySearch(char[] ch, char target) {
        int start = 0;
        int end = ch.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (ch[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return ch[start % ch.length];
    }

}
