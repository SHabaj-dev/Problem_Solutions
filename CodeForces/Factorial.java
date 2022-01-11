package CodeForces;

import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int num = sc.nextInt();

            factorial(num);
        }
    }

    public static void factorial(int num){
        int fact = 1;

        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }

    
}
