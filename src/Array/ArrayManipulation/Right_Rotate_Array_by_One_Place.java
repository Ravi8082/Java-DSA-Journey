package Array.ArrayManipulation;

import java.util.Scanner;

public class Right_Rotate_Array_by_One_Place {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the Array Values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = arr[n-1];

        for (int i = arr.length-1; i >0; i++) {
            arr[i] = arr[i-1];
        }
        arr[arr.length - 1] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
