package CodeForces;

import java.util.Scanner;

public class LuckyFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int num = sc.nextInt();
            luckyFour(num);
        }


        sc.close();
    }

    public static void luckyFour(int num){

        int count = 0;

        while(num > 0){
            int temp = num % 10;
            if(temp == 4){
                count++;
            }
            num /= 10;
        }

        System.out.println(count);


    }
    
}
