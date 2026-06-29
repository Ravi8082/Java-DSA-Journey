package Array.ArrayManipulation;

import java.util.Scanner;

public class Sort_0s_1s_2s {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the Array Values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < arr.length - 1; j++) {

            for (int i = j + 1; i < arr.length; i++) {

                if (arr[j] > arr[i]) {

                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }
            }
        }

        System.out.println("Sorted Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}