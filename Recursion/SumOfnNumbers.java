package Recursion;

import java.util.Scanner;

public class SumOfnNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sumnNumbers(num));
        sc.close();
        
    }

    public static int sumnNumbers(int num){
        if(num == 0){
            return 0;
        }
        int temp = num;
        temp += sumnNumbers(num - 1);
        return temp;
    }
    
}
