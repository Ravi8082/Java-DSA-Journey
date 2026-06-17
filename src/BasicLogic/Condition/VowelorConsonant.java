package BasicLogic.Condition;

import java.util.Scanner;

public class VowelorConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        if(a=='a' || a =='i' || a =='o' || a =='u'||
        a =='e' || a=='A' || a =='I' || a =='O' || a =='U'||
                a =='E'){
            System.out.println(a +" is Voewl");
        }
        else{
            System.out.println(a +" is consonant");
        }
    }
}
