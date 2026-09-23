import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept user inputs
        System.out.print("Enter the number to rotate (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of rotations (k): ");
        int k = scanner.nextInt();

        int rotatedNumber = rotate(n, k);
        System.out.println("Rotated number: " + rotatedNumber);

        scanner.close();
    }

    public static int rotate(int n, int k) {
        // Find the total number of digits in n
        int temp = n;
        int digitCount = 0;
        while (temp > 0) {
            temp /= 10;
            digitCount++;
        }

        // Handle cases where k is greater than the total number of digits
        k = k % digitCount;
        
        // Handle negative rotations by converting them to positive equivalents
        if (k < 0) {
            k = k + digitCount;
        }

        // Split the number and swap the parts
        int divisor = (int) Math.pow(10, k);
        int multiplier = (int) Math.pow(10, digitCount - k);

        int rightPart = n % divisor;
        int leftPart = n / divisor;

        return (rightPart * multiplier) + leftPart;
    }
}
