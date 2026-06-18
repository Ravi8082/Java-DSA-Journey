package Array.ArrayTraversal;

import java.util.Scanner;

public class Count_Odd_Numbers {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array: ");
            int n = sc.nextInt();
            int count = 0;
            int arr[] = new int[n];
            System.out.println("Enter the value of Array ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    count++;
                }
            }
            System.out.println(count);

        }
}