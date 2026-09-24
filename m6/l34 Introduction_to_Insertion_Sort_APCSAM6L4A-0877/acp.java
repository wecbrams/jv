import java.util.Arrays;

public class acp{
    public static void main(String[] args) {
        int[] a = {40, 10, 30, 20};
        int[] original = a.clone();

        // Insertion Sort
        for (int i = 1; i < a.length; i++) {
            int key = a[i], j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }

        // Find sorted position of each original element
        for (int x : original) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == x) {
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }
}