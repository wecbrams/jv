import java.util.*;

public class acp {

    static void generate(String s, int i, String result) {
        if (i == s.length()) {
            System.out.println(result);
            return;
        }

        char c = s.charAt(i);

        if (Character.isLetter(c)) {
            generate(s, i + 1, result + Character.toLowerCase(c));
            generate(s, i + 1, result + Character.toUpperCase(c));
        } else {
            generate(s, i + 1, result + c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        generate(s, 0, "");
    }
}