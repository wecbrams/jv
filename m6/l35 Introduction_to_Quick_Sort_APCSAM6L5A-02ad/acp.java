class Apple {
    int x, y, index;

    Apple(int x, int y, int index) {
        this.x = x;
        this.y = y;
        this.index = index;
    }
}

public class acp {

    static void quickSort(Apple[] a, int low, int high) {
        if (low >= high) return;

        int i = low, j = high;
        Apple pivot = a[(low + high) / 2];

        while (i <= j) {
            while (compare(a[i], pivot) < 0) i++;
            while (compare(a[j], pivot) > 0) j--;

            if (i <= j) {
                Apple temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        quickSort(a, low, j);
        quickSort(a, i, high);
    }

    static int compare(Apple a, Apple b) {
        if (a.x != b.x)
            return Integer.compare(a.x, b.x);

        // Alternate direction for each row
        if (a.x % 2 == 1)
            return Integer.compare(a.y, b.y);
        else
            return Integer.compare(b.y, a.y);
    }

    public static void main(String[] args) {
        Apple[] apples = {
            new Apple(1, 5, 0),
            new Apple(1, 10, 1),
            new Apple(2, 3, 2),
            new Apple(2, 8, 3)
        };

        quickSort(apples, 0, apples.length - 1);

        int[] eatenBefore = new int[apples.length];

        for (int i = 0; i < apples.length; i++)
            eatenBefore[apples[i].index] = i;

        for (int x : eatenBefore)
            System.out.print(x + " ");
    }
}