package String.Basic;

import java.util.Scanner;

public class patpresent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = sc.nextLine();

        String pattern = "i";

        if(str.contains(pattern)){
            System.out.println("Pattern is Present in the String");
        } else {
            System.out.println("Pattern is not Present in the String");
        }
    }
}
