package Array.ArrayTraversal;

import java.util.Scanner;

public class Find_Duplicate_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int ArraySize = sc.nextInt();
        int arr[] = new int[ArraySize];


        System.out.println("Enter the Array Values; ");
        for (int i = 0; i < ArraySize; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]+" is duplicate");
                }
            }

        }


    }
}
