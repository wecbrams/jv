public class acp{
    static void paths(int n, String path) {
        if (n == 0) {
            System.out.println(path);
            return;
        }

        if (n >= 1) paths(n - 1, path + "1 ");
        if (n >= 2) paths(n - 2, path + "2 ");
        if (n >= 3) paths(n - 3, path + "3 ");
    }

    public static void main(String[] args) {
        paths(3, "");
    }
}