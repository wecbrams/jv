public class Acp_ArrayAssignment {

    /**
     * Finds the second largest element in an array of integers.
     * 
     * @param arr The input array of integers.
     * @return The second-largest element, or -1 if the array has fewer than two elements.
     */
    public static int findSecondLargest(int[] arr) {
        // Check if the array has fewer than two elements
        if (arr == null || arr.length < 2) {
            return -1;
        }

        // Initialize largest and second largest to the smallest possible integer value
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse the array to find the two largest numbers
        for (int num : arr) {
            if (num > largest) {
                // Current number is larger than the largest found so far
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                // Current number is between largest and second largest
                secondLargest = num;
            }
        }

        // If secondLargest was never updated (e.g., all elements are identical), return -1
        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        // Test Case 1: Standard array
        int[] test1 = {12, 35, 1, 10, 34, 1};
        System.out.println("Second largest in test1: " + findSecondLargest(test1)); // Expected: 34

        // Test Case 2: Array with fewer than 2 elements
        int[] test2 = {5};
        System.out.println("Second largest in test2: " + findSecondLargest(test2)); // Expected: -1

        // Test Case 3: Array with duplicate largest numbers
        int[] test3 = {10, 10, 8};
        System.out.println("Second largest in test3: " + findSecondLargest(test3)); // Expected: 8
    }
}
