public class ACP_ArrayAssignment {

    /**
     * Finds the index of the column with the minimum number of zeros.
     * If there is a tie, it returns the first column encountered with that minimum.
     * 
     * @param grid The 2D array of integers
     * @return The 0-based index of the column with the fewest zeros
     */
    public static int findMinZeroColumn(int[][] grid) {
        // Assume the grid is not empty and has a regular rectangular shape
        int numRows = grid.length;
        int numCols = grid[0].length;
        
        int minZeros = Integer.MAX_VALUE; 
        int minZeroColIndex = -1;

        // Traverse the 2D array column by column
        for (int col = 0; col < numCols; col++) {
            int zeroCount = 0;
            
            // Count zeros in the current column
            for (int row = 0; row < numRows; row++) {
                if (grid[row][col] == 0) {
                    zeroCount++;
                }
            }
            
            // Update the minimum tracking variables if a new minimum is found
            if (zeroCount < minZeros) {
                minZeros = zeroCount;
                minZeroColIndex = col;
            }
        }
        
        return minZeroColIndex;
    }

    // Main method to test and showcase the functionality
    public static void main(String[] args) {
        // Sample 2D array:
        // Col 0 has 2 zeros
        // Col 1 has 1 zero
        // Col 2 has 0 zeros
        int[][] testGrid = {
            {0, 5, 3},
            {1, 0, 8},
            {0, 2, 7}
        };

        int resultCol = findMinZeroColumn(testGrid);
        System.out.println("The column index with the minimum number of zeros is: " + resultCol);
    }
}
