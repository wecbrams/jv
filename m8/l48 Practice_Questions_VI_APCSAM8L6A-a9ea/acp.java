import java.util.*;

public class acp {

    static void find(int[] a, int target, int i, List<Integer> list) {
        if (target == 0) {
            System.out.println(list);
            return;
        }

        if (target < 0 || i == a.length)
            return;

        // Use the current number again
        list.add(a[i]);
        find(a, target - a[i], i, list);
        list.remove(list.size() - 1);

        // Move to the next number
        find(a, target, i + 1, list);
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        find(candidates, target, 0, new ArrayList<>());
    }
}