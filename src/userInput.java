import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        // 1. Scanner is initialized
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("---Welcome to the Workout Tracker---");

        // 2. Call timeTrack
        timeTrack(inputScanner);

        // 3. Get workout choice
        String workoutChoice = userWorkout(inputScanner);

        // 4. FIX: Correctly pass the inputScanner to workoutTypes
        workoutTypes(workoutChoice, inputScanner);

        // 5. Close the scanner when done
        inputScanner.close();

    }


    static void timeTrack(Scanner scanner) {
        System.out.print("Date of workout (yyyy/MM/dd): ");
        String todaysDate = scanner.nextLine();
        System.out.println("Date: " + todaysDate);
    }


    static String userWorkout(Scanner scanner) {
        System.out.println("\n---Workout type Input---");
        // FIX: Added a space before the closing bracket for better readability
        System.out.print("Options: [Bench] [Squat] [Deadlift] [Cardio] ");
        System.out.print("Enter your Option: ");
        String workoutType = scanner.nextLine().trim();

        return workoutType;


    }

    // FIX: workoutTypes must accept two arguments: String and Scanner
    static void workoutTypes(String workoutChoice, Scanner scanner) {
        System.out.println("\n---Analysis----");

        // FIX: The switch statement was incorrectly attempting to assign a value
        // to 'focus' using a block-style switch without proper 'yield' or 'return'
        // values, and it contained fall-through logic for the first case.
        // It's restructured as a standard statement-style switch with 'break'
        // statements to execute specific logic for each case.

        switch (workoutChoice.toLowerCase()) {
            case "bench":
                System.out.print("How many sets?: ");
                String sets = scanner.nextLine();
                System.out.print("How many reps?: ");
                String reps = scanner.nextLine();

                System.out.println("\n---Summary---");
                System.out.println("Workout: Bench");
                System.out.println("Sets done: " + sets);
                System.out.println("Reps done: " + reps);
                break; // Essential to prevent execution of other cases

            case "squat":
                System.out.println("Tracking for Squat is not implemented yet.");
                break;

            case "deadlift":
                System.out.println("Tracking for Deadlift is not implemented yet.");
                break;

            case "cardio":
                System.out.println("Tracking for Cardio is not implemented yet.");
                break;

            default:
                System.out.println("Unknown workout type: " + workoutChoice + ". Please try again.");
                break;
        }

        // The original incomplete 'if (focus.equals())' was removed.
    }
}