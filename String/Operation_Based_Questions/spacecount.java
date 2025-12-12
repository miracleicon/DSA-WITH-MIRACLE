package String.Operation_Based_Questions;

import java.util.Scanner;

public class spacecount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = sc.nextLine();
        int countspace = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                countspace++;
            }
        }
        System.out.println("Number of Spaces in the String: " + countspace);
    }
    
}
