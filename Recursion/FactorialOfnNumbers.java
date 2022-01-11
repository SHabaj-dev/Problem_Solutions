package Recursion;

import java.util.Scanner;

public class FactorialOfnNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));
        sc.close();
    }

    public static int factorial(int num){
        int temp = num;
        if(num == 1){
            return 1;
        }

        temp *= factorial(num - 1);
        return temp;
    }
    
}
