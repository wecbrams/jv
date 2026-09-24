public class acp {

    static long mergeSort(int[] a, int l, int r) {
        if (l >= r) return 0;

        int m = (l + r) / 2;
        long count = mergeSort(a, l, m) + mergeSort(a, m + 1, r);

        int j = m + 1;
        for (int i = l; i <= m; i++) {
            while (j <= r && (long) a[i] > 2L * a[j])
                j++;
            count += j - (m + 1);
        }

        int[] temp = new int[r - l + 1];
        int i = l, k = 0;
        j = m + 1;

        while (i <= m && j <= r)
            temp[k++] = a[i] <= a[j] ? a[i++] : a[j++];

        while (i <= m) temp[k++] = a[i++];
        while (j <= r) temp[k++] = a[j++];

        System.arraycopy(temp, 0, a, l, temp.length);

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 3, 1};

        System.out.println("Reverse Pairs: " +
                mergeSort(nums, 0, nums.length - 1));
    }
}