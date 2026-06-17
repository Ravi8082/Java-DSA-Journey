package Array.ArrayTraversal;

import java.util.Scanner;

public class Sum_of_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int ArraySize = sc.nextInt();
        int arr[] = new int[ArraySize];
        int sum =0;
        System.out.println("Enter the Array Values; ");
        for (int i =0; i< ArraySize; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("This is  Array Values; ");
        for(int j =0; j<arr.length; j++){
            System.out.println(arr[j]);
            sum +=arr[j];

        }
        System.out.println("Sum of Array: "+ sum);
    }
}
