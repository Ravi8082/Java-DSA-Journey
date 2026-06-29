package Array.ArrayManipulation;

import java.util.LinkedList;
import java.util.Scanner;

public class Remove_Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the Array Values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                list.add(arr[i]);
            }
        }

        System.out.println(list);
    }
}
