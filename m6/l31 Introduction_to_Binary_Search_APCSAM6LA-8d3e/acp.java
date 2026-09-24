public class acp{
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int d = 35;

        int floor = Integer.MIN_VALUE;
        int ceil = Integer.MAX_VALUE;

        int low = 0, high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == d) {
                floor = ceil = a[mid];
                break;
            } else if (a[mid] < d) {
                floor = a[mid];
                low = mid + 1;
            } else {
                ceil = a[mid];
                high = mid - 1;
            }
        }

        System.out.println("Ceil: " + ceil);
        System.out.println("Floor: " + floor);
    }
}