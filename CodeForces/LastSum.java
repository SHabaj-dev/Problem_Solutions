package CodeForces;

import java.util.Scanner;

public class LastSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            System.out.println(firstandlastSum(num));
        }
        sc.close();
    }

    public static int firstandlastSum(int num) {
        int sum = 0;
        if (num >= 0 && num < 10) {
            return num;
        }
        int first = num % 10;
        int last = 0;
        while (num != 0) {
            last = num % 10;
            num /= 10;
        }

        sum = first + last;

        return sum;
    }
}
