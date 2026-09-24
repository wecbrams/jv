public class acp{
    public static void main(String[] args) {
        int[] a = {40, 10, 30, 20};
        int n = a.length;

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++)
                if (a[j] < a[min])
                    min = j;

            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        // Print sorted positions
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}