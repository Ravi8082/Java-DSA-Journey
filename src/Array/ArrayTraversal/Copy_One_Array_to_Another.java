package Array.ArrayTraversal;

import java.util.Scanner;

public class Copy_One_Array_to_Another {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int ArraySize = sc.nextInt();
        int arr[] = new int[ArraySize];
        int arr1[] = new int[ArraySize];


        System.out.println("Enter the Array Values; ");
        for (int i = 0; i < ArraySize; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i =0; i< arr.length; i++){
            arr1[i] = arr[i];
            System.out.println(arr1[i]);
        }



    }
}
