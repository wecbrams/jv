import java.util.*;

public class acp {
    static void printTargetSumSubsets(int[] arr, int i, int sum, int tar, String set) {
        if (i == arr.length) {
            if (sum == tar)
                System.out.println(set);
            return;
        }

        printTargetSumSubsets(arr, i + 1, sum + arr[i], tar, set + arr[i] + ", ");
        printTargetSumSubsets(arr, i + 1, sum, tar, set);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int tar = 60;

        printTargetSumSubsets(arr, 0, 0, tar, "");
    }
}