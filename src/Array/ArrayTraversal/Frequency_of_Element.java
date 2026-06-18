package Array.ArrayTraversal;

import java.util.Scanner;

public class Frequency_of_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int count =0;

        int arr[] = new int[n];

        System.out.println("Enter the array values:");
        for(int i = 0; i<n;i++) {
        arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value:");
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]){
                count++;
            }


        }
        System.out.println(count);
    }
}

