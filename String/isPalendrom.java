package String;

import java.util.Scanner;

public class isPalendrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();

        System.out.println(isPalendrom(inp));

    }

    public static boolean isPalendrom(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }

        str.toLowerCase();

        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end)
                return false;

        }

        return true;
    }

}
