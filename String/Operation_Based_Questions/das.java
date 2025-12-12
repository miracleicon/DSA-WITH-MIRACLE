package String.Operation_Based_Questions;
// count digits , alphabets , special characters in a string
import java.util.Scanner;

public class das {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = sc.nextLine();

        int digitcount = 0;
        int alphacount = 0;
        int specialcharcount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                digitcount++;
            }
            else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                alphacount++;
            }
            else {
                specialcharcount++;
            }
        }

        System.out.println("Number of Digits: " + digitcount);
        System.out.println("Number of Alphabets: " + alphacount);
        System.out.println("Number of Special Characters: " + specialcharcount);
    }
}
