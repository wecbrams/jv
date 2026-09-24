import java.util.Arrays;

public class ACP_MedianFinder {

    /**
     * Calculates the median value of an array of integers.
     * 
     * @param nums The input array of integers
     * @author AI Assistant
     * @return The median value as a double
     */
    public static double findMedian(int[] nums) {
        // Handle empty array edge case
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must not be empty.");
        }

        // 1. Sort the array in ascending order
        Arrays.sort(nums);

        int length = nums.length;
        int middleIndex = length / 2;

        // 2. Check if the array length is odd or even
        if (length % 2 != 0) {
            // Odd length: Return the single middle element
            return nums[middleIndex];
        } else {
            // Even length: Average the two middle elements
            int middleLeft = nums[middleIndex - 1];
            int middleRight = nums[middleIndex];
            return (middleLeft + middleRight) / 2.0;
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Test Case 1: Odd length array
        int[] oddArray = {7, 1, 3, 9, 5}; // Sorted: [1, 3, 5, 7, 9]
        System.out.println("Median of odd array: " + findMedian(oddArray)); // Expected: 5.0

        // Test Case 2: Even length array
        int[] evenArray = {2, 8, 4, 6}; // Sorted: [2, 4, 6, 8]
        System.out.println("Median of even array: " + findMedian(evenArray)); // Expected: 5.0
    }
}
