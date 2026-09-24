import java.util.*;

public class acp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        int numbers = 0, special = 0;

        for (char c : email.toCharArray()) {
            if (Character.isDigit(c))
                numbers++;
            else if (!Character.isLetter(c))
                special++;
        }

        System.out.println(numbers + "-" + special);
    }
}