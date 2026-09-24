// Importing necessary classes for input/output and array handling
// - The Scanner class can be used if needed, though not required here

// Define the class 'NQueens' where the logic to solve the N Queen problem is implemented
// Note: The filename should be 'NQueens.java' because the public class is named 'NQueens'

// Main method - Entry point of the program
// - Call the solveNQ method to find and display one solution for placing N queens

// solveNQ method - Solves the N Queen problem using backtracking
// - Initializes a 2D board array of size NxN to store queen placements
// - Calls the recursive utility function solveNQUtil to solve the problem
// - If a solution is found, prints the board configuration, otherwise prints "Solution does not exist"

// solveNQUtil method - Recursive backtracking utility function
// - It attempts to place queens in columns from left to right
// - It checks if placing a queen at a given row and column is safe by checking:
//   - Left diagonal (ld) for previous queens
//   - Right diagonal (rd) for previous queens
//   - Column (cl) for previously placed queens
// - If a queen can be placed in a safe position, it proceeds to place queens in the next column
// - If it can't place a queen in the current column, it backtracks by removing the queen and trying the next possibility

// printSolution method - Prints the current configuration of the board where queens are placed
// - Iterates through the board array and prints '1' where a queen is placed and '0' where it isn't

// IMPORTANT: Save this file as **NQueens.java** since the public class 'NQueens' matches the filename.
