package Array.ArrayTraversal;

import java.util.Scanner;

public class Array_is_Sorted {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i =0; i<arr.length; i++){
            if(i < arr[i]){
                System.out.println("Array is sorted: "+ arr[i]);
            }
            else {
                System.out.println("Array is not sorted: "+ arr[i]);
            }
        }
    }
}
