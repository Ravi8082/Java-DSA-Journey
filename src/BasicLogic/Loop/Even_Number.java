package BasicLogic.Loop;

import java.util.Scanner;

public class Even_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            if(i%2 ==0){
                System.out.println(i +"Even number");
            }
            else {
                System.out.println(i +" Odd number:");
            }
        }

    }
}
