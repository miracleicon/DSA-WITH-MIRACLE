package String.Basic;
import java.util.Scanner;
public class strlength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println("Length of String is: " + str.length());
    }
}
