package Recursion;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(SOD(num));
        sc.close();

    }

    public static int SOD(int num){
        if(num == 0){
            return 0;
        }
        int temp = num % 10;
        temp += SOD(num / 10);
        return temp;

    }
    
}
