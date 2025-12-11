package String.Basic;
import java.util.*;

public class uplow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();

        String upperStr = str.toUpperCase();
        String lowerStr = str.toLowerCase();

        System.out.println("Result: " + str + " | Upper: " + upperStr + " | Lower: " + lowerStr);
    }
}
