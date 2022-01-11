package CodeForces;

import java.util.Scanner;

public class reversNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int num = sc.nextInt();

            revNumber(num);
        }
    }

    public static void revNumber(int num){
        int rev = 0;
        while (num > 0) {

            rev = rev * 10 + (num % 10);
            num /= 10;
            
        }
        System.out.println(rev);
    }
    
}
