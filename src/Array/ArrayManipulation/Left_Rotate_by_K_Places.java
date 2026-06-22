package Array.ArrayManipulation;

import java.util.Scanner;

public class Left_Rotate_by_K_Places {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the size of Array");
            int n = sc.nextInt();

            int arr[] = new int[n];

            System.out.println("Enter the Array Values:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the K value");
            int k = sc.nextInt();
            int m =arr[0];
            for(int i =0; i<k; i++){

        for (int j = 0; j < arr.length-1; j++) {
            arr[j] = arr[j+1];

        }
        }
        arr[arr.length-1] =m;
        System.out.println("Array after moving k:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
