package JavaCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCollection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Enter the Elements : ");
        int elements;
        for(int i  = 0; i < 5; i++){
            elements = sc.nextInt();
            arrayList.add(elements);// The add method will add the inserted element to the end of the List.
        }
        
        System.out.println(arrayList);

        sc.close();
    }
    
}
