package Recursion;

import java.util.Scanner;

public class nNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        numberPrint(num);
        sc.close();
    }

    public static void numberPrint(int num){
        if(num == 0){
            return;
        }
        numberPrint(num - 1);
        System.out.println(num);
    }
    
}
