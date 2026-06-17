package Array.ArrayTraversal;

import java.util.Scanner;

public class Largest_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int ArraySize = sc.nextInt();
        int arr[] = new int[ArraySize];
        int max =0;
        System.out.println("Enter the Array Values; ");
        for (int i =0; i< ArraySize; i++){
            arr[i] = sc.nextInt();
    }
        max = arr[0];
        for(int j =0; j<arr.length; j++){

            if(arr[j] > max){
                max = arr[j];
            }
        }
        System.out.println(max);
    }
}
