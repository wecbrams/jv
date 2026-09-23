import java.util.Scanner;

public class RatingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rating (1-5): ");
        int rating = sc.nextInt();

        if (rating == 5)
            System.out.println("Excellent");
        else if (rating == 4)
            System.out.println("Very Good");
        else if (rating == 3)
            System.out.println("Good");
        else if (rating == 2)
            System.out.println("Average");
        else if (rating == 1)
            System.out.println("Poor");
        else
            System.out.println("Invalid Rating");
    }
}