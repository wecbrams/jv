import java.util.*;

public class acp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> list = new ArrayList<>();

        System.out.print("Enter characters: ");
        String input = sc.nextLine();

        for (char c : input.toCharArray())
            list.add(c);

        String str = "";

        for (char c : list)
            str += c;

        System.out.println("String: " + str);
        System.out.println("Length: " + str.length());

        String reverse = new StringBuilder(str).reverse().toString();
        System.out.println("Reverse: " + reverse);

        int mid = str.length() / 2;
        System.out.println("Word 1: " + str.substring(0, mid));
        System.out.println("Word 2: " + str.substring(mid));
    }
}