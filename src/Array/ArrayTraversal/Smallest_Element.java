package Array.ArrayTraversal;

import java.util.Scanner;

public class Smallest_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int ArraySize = sc.nextInt();
        int arr[] = new int[ArraySize];
        int min = 0;
        System.out.println("Enter the Array Values; ");
        for (int i = 0; i < ArraySize; i++) {
            arr[i] = sc.nextInt();
        }
        min = arr[0];
        for (int j =0 ; j<arr.length; j++){
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        System.out.println(min);
    }
}
