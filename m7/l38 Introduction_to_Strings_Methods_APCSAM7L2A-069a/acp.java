import java.util.*;

public class acp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        boolean pangram = true;

        for (char c = 'a'; c <= 'z'; c++) {
            if (str.indexOf(c) == -1) {
                pangram = false;
                break;
            }
        }

        if (pangram)
            System.out.println("is a Pangram");
        else
            System.out.println("is not a Pangram");
    }
}