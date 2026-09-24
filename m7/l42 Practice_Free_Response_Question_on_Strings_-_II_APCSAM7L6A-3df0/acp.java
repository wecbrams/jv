import java.util.*;

public class acp{

    static void partition(String s, int start, List<String> path) {
        if (start == s.length()) {
            System.out.println(path);
            return;
        }

        for (int end = start; end < s.length(); end++) {
            String part = s.substring(start, end + 1);

            if (isPalindrome(part)) {
                path.add(part);
                partition(s, end + 1, path);
                path.remove(path.size() - 1);
            }
        }
    }

    static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        partition(s, 0, new ArrayList<>());
    }
}