package Array.ArrayTraversal;

import java.util.Scanner;

public class Count_Positive_and_Negative_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int ArraySize = sc.nextInt();
        int arr[] = new int[ArraySize];
        System.out.println("Enter the Array Values; ");
        for (int i = 0; i < ArraySize; i++) {
            arr[i] = sc.nextInt();
        }

        int count =0;
        int count1 =0;
        for(int i =0; i< arr.length; i++){
            if(arr[i] >0){
                count++;
            } else if (arr[i]<0) {
                count1++;

            }
        }
        System.out.println("positive number"+ count);
        System.out.println("Negative Number"+count1);
    }
}
