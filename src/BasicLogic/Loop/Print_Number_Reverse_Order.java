package BasicLogic.Loop;

import java.util.Scanner;

public class Print_Number_Reverse_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for (int i =n; i>=1; i--){
            System.out.println(i);
        }
    }
}
