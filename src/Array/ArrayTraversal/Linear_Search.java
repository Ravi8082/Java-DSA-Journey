package Array.ArrayTraversal;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target value:");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                System.out.println("Target found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Target not found");
        }
    }
}