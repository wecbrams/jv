import java.util.*;

public class acp {
    static void permute(String s, String ans, int k) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            permute(
                s.substring(0, i) + s.substring(i + 1),
                ans + s.charAt(i),
                k
            );
        }
    }

    public static void main(String[] args) {
        String s = "123";
        int k = 4;

        permute(s, "", k);
    }
}