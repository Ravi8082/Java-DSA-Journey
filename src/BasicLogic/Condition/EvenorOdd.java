package BasicLogic.Condition;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value ");
        int n = sc.nextInt();
        if(n<0){
            n =-n;
        }
        for (; n>1; n-=2){

        }
        if(n ==0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }

    }
}
