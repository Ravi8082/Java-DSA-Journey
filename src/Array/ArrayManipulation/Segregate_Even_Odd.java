package Array.ArrayManipulation;

import java.util.Scanner;

public class Segregate_Even_Odd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the Array Values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int newArr[] = new int[n];
        int index = 0;

        // First loop: Store even numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                newArr[index] = arr[i];
                index++;
            }
        }

        // Second loop: Store odd numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                newArr[index] = arr[i];
                index++;
            }
        }

        System.out.println("Array after segregation:");

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}