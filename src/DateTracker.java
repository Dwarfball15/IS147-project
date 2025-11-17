import java.util.Scanner;

/**
 * The DateTracker class prompts the user to enter today's date.
 * This class is part of the IS147 Workout Tracker group project.
 *
 * <p>
 * It demonstrates basic user input handling using the Scanner class.
 * </p>
 *
 * @author Wuraola
 * @version 1.0
 */
public class DateTracker {

    /**
     * Main method for the DateTracker program.
     * Prompts the user to input the current date in MM-DD-YY format.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner trackerDate = new Scanner(System.in);

        System.out.print("Please enter today's date: MM-DD-YY");
    }
}


