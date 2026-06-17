package Array.ArrayTraversal;

import java.util.Scanner;

public class Second_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array");
        int arraySize = sc.nextInt();

        int arr[] = new int[arraySize];

        System.out.println("Enter the Array Values:");
        for (int i = 0; i < arraySize; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int secondMax = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        System.out.println("Second Largest Element: " + secondMax);
    }
}