import java.util.*;

public class ACP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String p = sc.nextLine();
        String t = sc.nextLine();

        int count = 0;

        for (int i = 0; i <= t.length() - p.length(); i++) {
            if (t.substring(i, i + p.length()).equals(p))
                count++;
        }

        System.out.println(count);
    }
}