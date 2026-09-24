public class Acp {
    static void zigZag(int n) {
        if (n == 0)
            return;

        System.out.print(n + " ");
        zigZag(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        zigZag(5);
    }
}