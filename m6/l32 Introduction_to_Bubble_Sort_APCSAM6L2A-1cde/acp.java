public class acp{

    static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++)
            for (int j = 0; j < a.length - i - 1; j++)
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
    }

    public static void main(String[] args) {
        int[] a = {5, 2, 8};
        int[] b = {7, 1, 4};

        sort(a);
        sort(b);

        int[] merged = new int[a.length + b.length];

        System.arraycopy(a, 0, merged, 0, a.length);
        System.arraycopy(b, 0, merged, a.length, b.length);

        sort(merged);

        for (int x : merged)
            System.out.print(x + " ");
    }
}